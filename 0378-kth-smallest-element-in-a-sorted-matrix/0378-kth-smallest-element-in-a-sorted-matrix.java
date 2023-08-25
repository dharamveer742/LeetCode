class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        int mid=0;
        int count=0;
       
        while(low<=high){
            mid=low+(high-low)/2;  // 8 12 14 13
            count=0;

            
               count=getLessEqual(matrix,mid,n); // 2-8   6-12  8-14 8-13
            
            if(count<k){
                low=mid+1;  // 9 13
            }
            else{
                high=mid-1; // 13
            }
        }
        return low;   // 13
    }
    
    
    public int getLessEqual(int[][] matrix,int no,int n){ 
        int col = n-1;
        int row= 0;
        int cnt=0;
        while(row<n && col>=0){
            if(matrix[row][col]<=no){
                row++;
                cnt = cnt + col+1;
            }
            else{
                col--;
            }
        }
        return cnt;
    }
}