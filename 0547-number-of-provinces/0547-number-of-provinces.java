class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces =0;
        for(int v=0;v<n;v++){
            if(visited[v]==false){
                provinces++;
                dfs(v,isConnected,visited);
            }
        }
        return provinces;
    }
    
    public void dfs(int v,int[][] isConnected,boolean[] visited){
        visited[v]  = true;
        for(int j=0;j<visited.length;j++){
            if(isConnected[v][j]==1 && visited[j]==false){
                dfs(j,isConnected,visited);
            }
        }
    }
    
    
}