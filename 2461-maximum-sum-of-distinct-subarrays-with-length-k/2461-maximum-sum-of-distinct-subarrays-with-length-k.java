class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long maxSum = 0;
        long sum=0;
        for(int i=0;i<k-1;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=k-1;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.size()==k){
                maxSum= Math.max(sum,maxSum);
            }
            sum-=nums[i-k+1];
            // remove 
            int count = map.get(nums[i-k+1]);
            if(count==1){
                map.remove(nums[i-k+1]);
            }
            else{
                map.put(nums[i-k+1],count-1);
            }
        }
        return maxSum;
    }
}