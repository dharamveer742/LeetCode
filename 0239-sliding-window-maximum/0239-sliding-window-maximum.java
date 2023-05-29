class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int windowStart=0;
        int windowEnd=0;
        int index = 0;
        int[] ans = new int[arr.length-k+1];
        Deque<Integer> maximums = new ArrayDeque<>();
        while(windowEnd< arr.length){
            if(windowEnd-windowStart+1<k){
                while(!maximums.isEmpty() && arr[windowEnd]>arr[maximums.peekLast()]){
                    maximums.pollLast();
                }
                maximums.offer(windowEnd);
                windowEnd++;
            }
            else if(windowEnd-windowStart+1==k){
                while(!maximums.isEmpty() && arr[windowEnd]>arr[maximums.peekLast()]){
                    maximums.pollLast();
                }
                maximums.offer(windowEnd);
                if(windowEnd-windowStart+1==k) {
                    ans[index] = arr[maximums.peekFirst()];
                    index++;
                }
                if(!maximums.isEmpty() && maximums.peekFirst()<=windowStart){
                    maximums.pollFirst();
                }
                windowStart++;
                windowEnd++;
            }

        }
        return ans;
        
    }
}