class Solution {
    public int coinChange(int[] coins, int amount) {
    int n = coins.length;
    int[][] dp = new int[n + 1][amount + 1];

    // Initialize dp array
    for (int i = 0; i <= n; i++) {
        Arrays.fill(dp[i], amount + 1);
    }
    dp[0][0] = 0;

    // Fill dp array
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= amount; j++) {
            if (coins[i - 1] <= j) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    return dp[n][amount] > amount ? -1 : dp[n][amount];
}

}