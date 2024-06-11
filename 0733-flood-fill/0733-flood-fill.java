class Solution {
      public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        //if(iniColor == color) return image;
       // int[][] ans = image;
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1}; 
        dfs(sr, sc, image,iniColor,color, delRow, delCol); 
        return image; 
        
    }
    
  void dfs(int row,int col,int[][] image,int iniColor,int newColor,int delRow[], int delCol[]){
       // ans[row][col] = newColor;
        image[row][col]=newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0;i<4;i++) {
            int nrow = row + delRow[i]; 
            int ncol = col + delCol[i]; 
            // check for valid coordinate 
            // then check for same initial color and unvisited pixel
            if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && 
            image[nrow][ncol] == iniColor && image[nrow][ncol]!=newColor) {
                dfs(nrow, ncol, image,iniColor, newColor, delRow, delCol); 
            }
        }
        
    }
}