class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        if(len<3) return false;
        int i=1;
        while(i<len-1){
            int first = arr[i-1];
            int second = arr[i];
            int third = arr[i+1];
            if(first%2!=0 && second%2!=0 && third%2!=0){
                return true;
            }
            i=i+1;
        }
        return false;
    }
}