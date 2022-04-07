class Solution {
    
    public int longestIncreasingPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] inDegree = new int[n][m];
        int[][] dirs = {
            {0, 1}, 
            {0, -1}, 
            {1, 0}, 
            {-1, 0}
        };
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int[] dir: dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && x < n && y >= 0 && y < m && mat[x][y] > mat[i][j]){
                        inDegree[x][y]++;
                    }
                }
            }
        }
        
        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(inDegree[i][j] == 0) {
                    q.addLast(i * m + j);
                }
            }
        }
        
        int level = 0;
        while(q.size() > 0) {
            int s = q.size();
            while(s-- > 0) {
                int idx = q.removeFirst();
                int i = idx / m;
                int j = idx % m;
                for(int[] dir: dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && x < n && y >= 0 && y < m && mat[x][y] > mat[i][j]){
                        inDegree[x][y]--;
                        if(inDegree[x][y] == 0)
                            q.addLast(x * m + y);
                    }
                }
            }
            level++;
        }
        return level;
    }
}