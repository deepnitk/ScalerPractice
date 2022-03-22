// Memoization
public class Solution {
    public int minDistance(String A, String B) {
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n][m];
        for(int[] arr : dp)
            Arrays.fill(arr, -1);
        return minOp(A,B, n-1, m-1, dp);
    }

    private int minOp(String A, String B, int i, int j, int[][] dp){
        if(i < 0 && j < 0) return 0;
        if(i<0) return j+1;
        if(j<0) return i+1;
        
        if(A.charAt(i) == B.charAt(j))
            return dp[i][j] = minOp(A,B, i-1, j-1, dp);
        else
            //(i-1, j) : delete; (i,j-1): insert; (i-1,j-1): replace
            return dp[i][j] = 1 + Math.min(
                minOp(A,B, i-1, j, dp), 
                Math.min(minOp(A,B, i, j-1, dp), minOp(A,B, i-1, j-1, dp)));
    }
}
