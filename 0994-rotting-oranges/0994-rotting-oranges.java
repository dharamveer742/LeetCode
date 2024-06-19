class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntFresh = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    visited[i][j]=true;
                    q.offer(new int[]{i,j,0});
                }
                if(grid[i][j]==1){
                    cntFresh++;
                }
                
            }
        }
        int time =0;
        int cnt = 0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int[] p = q.poll();
            int row =p[0];
            int col =p[1];
            int t =p[2];
            time = Math.max(time,t);
            for(int i=0;i<4;i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && visited[nrow][ncol]==false){
                    q.offer(new int[]{nrow,ncol,t+1});
                    visited[nrow][ncol] = true; 
                    cnt++;
                }
            }
            
        }
        if(cntFresh != cnt) return -1;
        return time;
        
    }
    
}