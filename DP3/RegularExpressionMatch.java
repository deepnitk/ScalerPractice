//Tabulation Approach
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isMatch(final String A, final String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] dp = new boolean[n+1][m+1];
        
        if(check(A,B, n, m, dp)) return 1;
        return 0;
    }

    private boolean check(String A, String B, int n, int m, boolean[][] dp){
        //Base case
        // 1. empty string and empty pattern
        dp[0][0] = true;
        // 2. Empty pattern and non-empty string
        for(int i=1;i<=n;i++)
            dp[i][0] = false;
        // 3. Empty String and non-empty Pattern
        for(int j=1;j<=m;j++){
            // if all are '*', mark it as true
            if(B.charAt(j-1) == '*')
                dp[0][j] = dp[0][j-1];
            else
                dp[0][j] = false;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.charAt(i-1) == B.charAt(j-1) || B.charAt(j-1) == '?')
                    dp[i][j] = dp[i-1][j-1];
                else if(B.charAt(j-1) == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                else
                    dp[i][j] = false;
            }
        }
        return dp[n][m];
    }
}
