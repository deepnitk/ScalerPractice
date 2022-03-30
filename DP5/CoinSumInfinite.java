// Recursive+ memoization solution
public class Solution {
    public int coinchange2(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] arr: dp)
            Arrays.fill(arr, -1);
        return coinChangeUtil(coins.length-1, coins, amount, dp);
    }

    private int coinChangeUtil(int idx, int[] coins, int amount, int[][] dp){
        if(idx==0) {
            if((amount % coins[0] == 0)) return 1;
            return 0;
        }
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int notPick = coinChangeUtil(idx-1, coins, amount, dp)%1000007;        
        int pick = 0;
        if(coins[idx]<=amount)
            pick = (coinChangeUtil(idx, coins, amount - coins[idx], dp))%1000007;

        
        return dp[idx][amount] = (pick + notPick)%1000007;
    }    
}
