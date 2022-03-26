//Recursive solution

public class Solution {
    public int solve(int[] candies, int[] sweetness, int[] cost, int nibbles) {
        int n = candies.length;
        return candiesUtils(n-1, candies, sweetness, cost, nibbles);
    }

    private int candiesUtils(int n, int[] candies, int[] sweetness, int[] cost, int nibbles){
        if(n<0 || nibbles< 0) return 0;
        int pick = 0;
        int notPick = 0;

        if(nibbles >= cost[n])
            pick = candies[n]*sweetness[n] + candiesUtils(n, candies, sweetness, cost, nibbles-cost[n]);
        notPick = 0 + candiesUtils(n-1, candies, sweetness, cost, nibbles);

        return Math.max(pick, notPick);
    }
}

//Memoization solution using dp array

public class Solution {
    public int solve(int[] candies, int[] sweetness, int[] cost, int nibbles) {
        int n = candies.length;
        int[][] dp = new int[n+1][nibbles+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return candiesUtils(n-1, candies, sweetness, cost, nibbles, dp);
    }

    private int candiesUtils(int n, int[] candies, int[] sweetness, int[] cost, int nibbles, int[][] dp){
        if(n<0 || nibbles< 0) return 0;
        int pick = 0;
        int notPick = 0;
        if(dp[n][nibbles] != -1) return dp[n][nibbles];
        if(nibbles >= cost[n])
            pick = candies[n]*sweetness[n] + candiesUtils(n, candies, sweetness, cost, nibbles-cost[n], dp);
        notPick = 0 + candiesUtils(n-1, candies, sweetness, cost, nibbles, dp);

        return dp[n][nibbles] = Math.max(pick, notPick);
    }
}


