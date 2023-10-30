class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // two pinter
        int low=0;
        int high =arr.length-1;
        while(high-low+1>k){
            int startDiff = Math.abs(arr[low]-x);
            int lastDiff = Math.abs(arr[high]-x);
            if(startDiff>lastDiff){
                low++;
            }
            else{
                high--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(low<=high){
            ans.add(arr[low]);
            low++;
        }
        return ans;
    }
}