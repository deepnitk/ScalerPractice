// Memoization solution

public class Solution {
    public int solve(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][n+1];
        for(int[] arr: dp)
        Arrays.fill(arr, -1);
        return rodCuttingUtils(n -1, n, prices, dp);
    }

    private int rodCuttingUtils(int idx, int n, int[] prices, int[][] dp){
        if(idx == 0) return n*prices[0];
        
        if(dp[idx][n] != -1) return dp[idx][n];
        int notPick = 0 + rodCuttingUtils(idx-1, n, prices, dp);
        int pick = 0;
        int rodLength = idx+1;
        if(rodLength <= n) pick += prices[idx] + rodCuttingUtils(idx, n-rodLength, prices, dp);

        return dp[idx][n] = Math.max(pick, notPick);
    }
}
