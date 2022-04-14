//Recursive Solution
//TC: exponential
//SC: exponential
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        return numDistinctUtils(n-1, m-1, s, t);
    }
    
    private int numDistinctUtils(int i, int j, String s1, String s2){
        if(j<0) return 1;
        if(i<0) return 0;
        
        if(s1.charAt(i) == s2.charAt(j))
            return numDistinctUtils(i-1, j-1, s1, s2) + numDistinctUtils(i-1, j, s1, s2);
        else
            return numDistinctUtils(i-1, j, s1, s2);
    }
}

//Memoization solution
//TC: O(N*M)
//SC: O(N*M) + O(N+M)

class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp)
            Arrays.fill(row, -1);
        return numDistinctUtils(n-1, m-1, s, t, dp);
    }
    
    private int numDistinctUtils(int i, int j, String s1, String s2, int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = numDistinctUtils(i-1, j-1, s1, s2, dp) + numDistinctUtils(i-1, j, s1, s2, dp);
        else
            return dp[i][j] = numDistinctUtils(i-1, j, s1, s2, dp);
    }
}

//Tabulation solution
//TC: O(N*M)
//SC: O(N*M)
class Solution {
    static int prime =(int)(Math.pow(10,9)+7);
    public int numDistinct(String s, String t) {
        
        return numDistinctUtils(s, t);
    }
    
    private int numDistinctUtils(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp)
            Arrays.fill(row, 0);
        
        for(int i=0;i<=n;i++)
            dp[i][0] = 1;
        for(int j=1;j<=m;j++)
            dp[0][j] = 0;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=m;j++){
                
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%prime;
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][m];
    }
}
