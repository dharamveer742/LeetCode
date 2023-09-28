
    class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=left+(right-left)/2;
        int index=-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
               index=mid;
                break;
            }
            if(right-left<=1){
                if(target>nums[left] && target>nums[right]){
                    index= right+1;
                    break;
                }
                else if(target>nums[left]){
                    index= right;
                    break;
                }
                else {
                   index=left;
                    break;
                }
                
                
            }
            if(target>nums[mid]){
                left=mid+1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            
        }
        return index;
    }
}
