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
