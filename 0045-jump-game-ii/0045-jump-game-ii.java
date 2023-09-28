// top-down approach

// bottom up approach 
import java.util.Arrays;
class Solution {
    public int jump(int[] nums) {
        if(nums[0]==0){
            return 0;
        
        }
        int len= nums.length;
        if(len==1){
            return 0;
        }
        int[] dp= new int[len];
        for(int i=1;i<len;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(nums[j]+j>=i){
                    min=Math.min(min,dp[j]);
                }
            }
             
        dp[i]=min+1;
            
           
        }
        return dp[len-1];
    }
}