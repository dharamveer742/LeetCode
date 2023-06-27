class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int windowEnd=0;
        int windowStart=0;
        long ans=0;
        long sum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(windowEnd<nums.length){
            if(windowEnd-windowStart+1<k){
                sum+=nums[windowEnd];
                if(mp.containsKey(nums[windowEnd])){
                    mp.put(nums[windowEnd],mp.get(nums[windowEnd])+1);
                }
                else{
                    mp.put(nums[windowEnd],1);
                }
                windowEnd++;
            }
            else if(windowEnd-windowStart+1==k){
                sum+=nums[windowEnd];
                if(mp.containsKey(nums[windowEnd])){
                    mp.put(nums[windowEnd],mp.get(nums[windowEnd])+1);
                }
                else{
                    mp.put(nums[windowEnd],1);
                }
                if(mp.size()==k){
                    ans=Math.max(ans,sum);
                }
                int freq=mp.get(nums[windowStart]);
                sum-=nums[windowStart];
                if(freq==1){
                    mp.remove(nums[windowStart]);
                }
                else{
                    mp.put(nums[windowStart],mp.get(nums[windowStart])-1);
                }
                    
                windowStart++;
                windowEnd++;
            }
        }
        return ans;
    }
}