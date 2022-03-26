public class Solution {
    public int solve(int A) {
        return utils(A);
    }
    private int utils(int n){
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(n == 3) return 5;
        long mod = 1000000007;
        long[] dp = new long[2];
        dp[0] = 3;
        dp[1] = 5;
        for (int i = 4; i <= n; i++) {
            long temp = (dp[0] + dp[1]) % mod;
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return (int) dp[1];
        
    }
}
