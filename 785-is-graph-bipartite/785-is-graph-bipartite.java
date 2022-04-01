class Solution {
    public boolean isBipartite(int[][] graph) {
        int vtcs = graph.length;
        int[] visited = new int[vtcs];
        Arrays.fill(visited, -1);
        for(int i = 0; i < vtcs; i++) {
            if(visited[i] == -1) {
                boolean even = isEven(graph, i, visited);
                if(!even) return false;    
            }
        }
        return true;
    }
    
    public boolean isEven(int[][] graph, int src, int[] visited) {
        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        int color = 0;
        while(que.size() > 0) {
            int s = que.size();
            while(s-- > 0) {
                int t = que.removeFirst();
                if(visited[t] != -1 && visited[t] != color) return false;
                visited[t] = color;
                for(int nbr: graph[t]) {
                    if(visited[nbr] == -1) que.addLast(nbr);
                }
            }
            color = (color + 1) % 2;
        }
        return true;
    }
}