//Memoization
//TC: O(N) SC: O(N)
public class Solution {
    public int solve(String A, String B) {
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return findLcs(A,B, n-1, m-1, dp);
    }

    private int findLcs(String A, String B, int i, int j, int[][] dp){
        if(i == -1 || j == -1) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(A.charAt(i) == B.charAt(j))
            dp[i][j] = 1 + findLcs(A,B, i-1,j-1,dp);
        else
            dp[i][j] = Math.max(findLcs(A,B, i-1,j,dp), findLcs(A,B, i,j-1, dp));
        
        return dp[i][j];

    }
}
