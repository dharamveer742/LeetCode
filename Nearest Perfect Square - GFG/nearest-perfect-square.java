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


// Back-end complete function Template for Java

class Solution {
    int[] nearestPerfectSquare(int N) {
        double root = Math.sqrt(N);
        double lower = Math.floor(root), upper = Math.ceil(root);
        int[] ans = new int[2];
        if (upper - root <= root - lower) {
            ans[0] = (int)(upper * upper);
        } else {
            ans[0] = (int)(lower * lower);
        }
        ans[1] = Math.abs(ans[0] - N);
        return ans;
    }
}