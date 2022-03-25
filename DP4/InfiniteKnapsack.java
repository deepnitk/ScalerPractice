//Tabulation
public class Solution {
    public int solve(int capacity, int[] values, int[] weights) {
        return knapsackUtils(values.length, capacity, weights, values);
    }

     private int knapsackUtils(int n, int capacity, int[] weights, int[] values){
        int[][] dp = new int[values.length+1][capacity+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], 0);
        }
        //Base cond
        for(int i=weights[0]; i<=capacity; i++){
            dp[0][i] = values[0];
        }

       
       for(int idx =1; idx<n; idx++){
        for(int cap=0; cap<=capacity; cap++){
            int pick = 0;
            if(cap-weights[idx] >= 0)
                pick = values[idx] + dp[idx][cap - weights[idx]];
            int notPick = 0 + dp[idx-1][cap];
            dp[idx][cap] = Math.max(pick, notPick);
        }
       }
       return dp[n-1][capacity];
    }
}
