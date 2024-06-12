class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] dist = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                    dist[i][j]=0;
                }  
            }
        }
        int[] drow={-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] polled = q.poll();
            int row = polled[0];
            int col = polled[1];
            int currDist = polled[2];
            dist[row][col] = currDist;
            for(int i=0;i<4;i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && mat[nrow][ncol]==1 && visited[nrow][ncol]==false){
                    visited[nrow][ncol] = true;
                    q.offer(new int[]{nrow,ncol,currDist+1});
                }
            }
            
        }
       return dist; 
    }
}