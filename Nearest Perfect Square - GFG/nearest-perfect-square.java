//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans[] = ob.nearestPerfectSquare(N);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] nearestPerfectSquare(int N) {
        long left =0;
        long right = N;
        while(left<=right){
            long mid = left+(right-left)/2;
            if(mid*mid==N){
                int[] ans = new int[2];
                int mul = (int) mid*(int) mid;
                ans[0]=mul;
                
                ans[1]=0;
                return ans;
            }
            else if(mid*mid>N){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            
        }
        int[] ans = new int[2];
       
        if(left*left-N<N-right*right){
            ans[0]=(int) left*(int)left;
            ans[1]=(int) left*(int)left-N;
        }
        else{
            ans[0]=(int) right*(int)right;
            ans[1]= (int) N-(int)right*(int)right;
        }
        return ans;
    }
}