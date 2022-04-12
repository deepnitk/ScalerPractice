//Mmeoization solution

public class Solution {
    public int solve(String s) {
        String t = s;
        String ss=new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] arr:dp)
            Arrays.fill(arr, -1);
        return lcs(n-1, n-1, ss, t, dp);
    }

    private int lcs(int idx1, int idx2, String s1, String s2, int[][] dp){
        if(idx1<0 || idx2<0) return 0;

        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];

        if(s1.charAt(idx1) == s2.charAt(idx2)) 
            return dp[idx1][idx2] = 1 + lcs(idx1-1, idx2-1, s1, s2, dp);
        return dp[idx1][idx2] = 0 + Math.max(lcs(idx1-1, idx2, s1, s2, dp), lcs(idx1, idx2-1, s1, s2, dp));
    }
}
