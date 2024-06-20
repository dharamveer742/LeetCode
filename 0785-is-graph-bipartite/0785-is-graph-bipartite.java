class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }
        for(int v=0;v<n;v++){
            if(color[v]==-1){
                if(bfs(graph,color,n,v)==false) return false;
            }
        }
        return true;
    }
    
    public boolean bfs(int[][] graph,int[] color,int n,int v){
         Queue<Integer> q = new LinkedList<>();
         q.offer(v);
         color[v]=0;
         while(!q.isEmpty()){
            int node = q.poll();
            int adjColor = (color[node]==0)?1:0;
            for(int j=0;j<graph[node].length;j++){
                int adj = graph[node][j];
                if(color[adj]==-1){
                    q.offer(adj);
                    color[adj] = adjColor;
                }
                else if(color[adj]!=adjColor){
                    return false;
                }
            }
             
         } 
        return true;
    }
}