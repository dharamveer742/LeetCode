class Solution {
    public double myPow(double x, int n) {
         long newN = n;
        if(newN<0){
            newN = -newN ;
            x=1/x;
        }
        double ans=1;
        while(newN!=0) {
            if (newN % 2 == 0) {
                x *= x;
                newN = newN / 2;
            } else {
                ans *= x;
                newN = newN - 1;
            }
        }
        return ans;
    }
}