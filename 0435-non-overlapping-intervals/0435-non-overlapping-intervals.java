class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int removecnt = 0;
        int last = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<last){
                removecnt++;
            }
            else{
                last = intervals[i][1];
            }
        }
        return removecnt;
    }
}