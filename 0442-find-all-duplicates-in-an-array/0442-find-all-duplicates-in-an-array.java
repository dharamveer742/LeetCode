class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int newIndex = Math.abs(nums[i])-1;
            if(nums[newIndex]<0){
                ans.add(newIndex+1);
                nums[newIndex]=-nums[newIndex];
            }
            else{
                nums[newIndex]=-nums[newIndex];
            }
        }
        return ans;
    }
}