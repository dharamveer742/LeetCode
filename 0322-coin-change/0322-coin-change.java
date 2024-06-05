
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] memo = new int[n + 1][amount + 1];
        
        // Initialize the memoization table with a special value indicating uncomputed states
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        int result = coinChangeHelper(coins, n, amount, memo);
        return result > amount ? -1 : result;
    }
    
    private int coinChangeHelper(int[] coins, int n, int amount, int[][] memo) {
        // Base case: when amount is 0, no coins are needed
        if (amount == 0) {
            return 0;
        }
        
        // If no coins left or amount becomes negative, return a large number (infinity)
        if (n == 0 || amount < 0) {
            return Integer.MAX_VALUE - 1; // Using Integer.MAX_VALUE - 1 to avoid overflow in addition
        }
        
        // If the result is already computed, return it
        if (memo[n][amount] != -1) {
            return memo[n][amount];
        }
        
        // Option 1: Exclude the current coin
        int exclude = coinChangeHelper(coins, n - 1, amount, memo);
        
        // Option 2: Include the current coin
        int include = Integer.MAX_VALUE - 1;
        if (coins[n - 1] <= amount) {
            include = coinChangeHelper(coins, n, amount - coins[n - 1], memo) + 1;
        }
        
        // Take the minimum of both options and store it in the memoization table
        memo[n][amount] = Math.min(exclude, include);
        return memo[n][amount];
    }

}