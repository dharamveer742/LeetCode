class Solution {
   public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int[][] ans = image;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1}; 
        dfs(sr, sc,ans,iniColor,color, delRow, delCol); 
        return ans; 
        
    }
    
  void dfs(int row,int col,int[][] ans,int iniColor,int newColor,int delRow[], int delCol[]){
        ans[row][col] = newColor;
        int n = ans.length;
        int m = ans[0].length;
        for(int i = 0;i<4;i++) {
            int nrow = row + delRow[i]; 
            int ncol = col + delCol[i]; 
            // check for valid coordinate 
            // then check for same initial color and unvisited pixel
            if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && 
            ans[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol,ans,iniColor, newColor, delRow, delCol); 
            }
        }
        
    }
}