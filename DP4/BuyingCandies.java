//Recursive solution

public class Solution {
    public int solve(int[] candies, int[] sweetness, int[] cost, int nibbles) {
        int n = candies.length-1;
        return candiesUtils(n, candies, sweetness, cost, nibbles);
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
