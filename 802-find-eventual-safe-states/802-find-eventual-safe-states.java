class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v = graph.length;
        int[] seen = new int[v];
        for(int i = 0; i < graph.length; i++) {
            if(seen[i] == 0) {
                boolean cycle = dfs(i, graph, seen);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < v; i++) {
            if(seen[i] == 2) {
                res.add(i);
            }
        }
        return res;
    }
    
    public boolean dfs(int src, int[][] graph, int[] seen) {
        seen[src] = 1;
        for(int nbr: graph[src]) {
            if(seen[nbr] == 0){
                boolean cycle = dfs(nbr, graph, seen);
                if(cycle) return true;
            } else if(seen[nbr] == 1) {
                return true;
            }
        }
        seen[src] = 2;
        return false;
    }
}