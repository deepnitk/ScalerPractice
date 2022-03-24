//Recursive solution

public class Solution {
    public int solve(int[] values, int[] weights, int capacity) {
        return f(values.length -1, capacity, weights, values);
    }

    private int f(int idx, int capacity, int[] weights, int[] values){
        if(idx < 0 || capacity < 0) return 0;
        int pick = 0;
        if(capacity-weights[idx] >= 0)
            pick = f(idx-1, capacity-weights[idx], weights, values) + values[idx];
        int notPick = f(idx-1, capacity, weights, values);
        return Math.max(pick, notPick);
    }
}

//Memoization
//TC:O(N*W)
//SC: O(N*W) + O(N)
public class Solution {
    public int solve(int[] values, int[] weights, int capacity) {
        int[][] dp = new int[values.length+1][capacity+1];
        for(int i=0;i<values.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return f(values.length -1, capacity, weights, values, dp);
    }

    private int f(int idx, int capacity, int[] weights, int[] values, int[][] dp){
        if(idx < 0 || capacity < 0) return 0;
        int pick = 0;
        if(dp[idx][capacity] != -1) return dp[idx][capacity];
        if(capacity-weights[idx] >= 0)
            pick = f(idx-1, capacity-weights[idx], weights, values, dp) + values[idx];
        int notPick = f(idx-1, capacity, weights, values, dp);
        return dp[idx][capacity] = Math.max(pick, notPick);
    }
}

//Tabulation
//TC:O(N*W)
//SC: O(N*W) + O(N)
public class Solution {
    public int solve(int[] values, int[] weights, int capacity) {
        
        return f(values.length, capacity, weights, values);
    }

    private int f(int n, int capacity, int[] weights, int[] values){
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
                pick = values[idx] + dp[idx-1][cap - weights[idx]];
            int notPick = 0 + dp[idx-1][cap];
            dp[idx][cap] = Math.max(pick, notPick);
        }
       }
       return dp[n-1][capacity];
    }
}
