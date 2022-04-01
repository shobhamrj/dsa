class Solution {
    
    class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    public int orangesRotting(int[][] grid) {
        LinkedList<Pair> que = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    que.addLast(new Pair(i, j));
                } else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int level = -1;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while(que.size() > 0) {
            int size = que.size();
            level++;
            while(size-- > 0) {
                Pair rem = que.removeFirst();
                for(int i = 0; i < dirs.length; i++) {
                    int rdash = rem.row + dirs[i][0];
                    int cdash = rem.col + dirs[i][1];
                    if(rdash >= 0 && cdash >= 0 &&  rdash < grid.length && cdash < grid[0].length                           && grid[rdash][cdash] == 1) {
                        que.addLast(new Pair(rdash, cdash));
                        grid[rdash][cdash] = 0;
                        fresh --; 
                    }
                }
            }
        }
        return (fresh == 0)? level : -1;
    }
}