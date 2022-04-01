class Solution {
    
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        LinkedList<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {
                    q.addLast(i * m + j);
                }
            }
        }
        
        if(q.size() == m * n || q.size() == 0) return -1;
        
        int level = 0;
        int[][] dirs = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while(q.size() > 0) {
            int s = q.size();
            while(s-- > 0) {
                int idx = q.removeFirst();
                int i = idx / m;
                int j = idx % m;
                for(int[] dir: dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && y >= 0 && x < n && y < m && grid[x][y] == 0) {
                        q.addLast(x * m + y);
                        grid[x][y] = 1;
                    }
                }
            }
            level++;
        }
        return level - 1;
    }
    
}