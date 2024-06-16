class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        for(int col=0;col<n;col++){
            if(visited[0][col]==false && grid[0][col]==1){
                dfs(grid,0,col,visited,drow,dcol,m,n);
                visited[0][col]=true;
            }
            if(visited[m-1][col]==false && grid[m-1][col]==1){
                dfs(grid,m-1,col,visited,drow,dcol,m,n);
                visited[m-1][col]=true;
            }
        }
        for(int row=0;row<m;row++){
            if(visited[row][0]==false && grid[row][0]==1){
                dfs(grid,row,0,visited,drow,dcol,m,n);
                visited[row][0]=true;
            }
            if(visited[row][n-1]==false && grid[row][n-1]==1){
                dfs(grid,row,n-1,visited,drow,dcol,m,n);
                visited[row][n-1]=true;
            }
        }
        int cnt =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                    cnt ++;
                }
            }
        }
        return cnt;
    }
    
    public void dfs(int[][] grid,int row,int col,boolean[][] visited,int[] drow,int[] dcol,int m,int n){
        for(int i=0;i<4;i++){
            int nrow = row+drow[i];
            int ncol = col+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]==false && grid[nrow][ncol]==1){
                visited[nrow][ncol]=true;
                dfs(grid,nrow,ncol,visited,drow,dcol,m,n);
            }
        }
        
    } 
}

//4