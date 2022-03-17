public class Solution {
    
    public int countMinSquares(int A) {
        ArrayList<Integer> dp = new ArrayList<Integer>(Collections.nCopies(A+1, -1));
        return solve(A, dp);
    }

    private int solve(int n, ArrayList<Integer> dp){
        if(n==0) return 0;
        if(dp.get(n)!= -1) return dp.get(n);
        dp.set(n,1);
        int ans = Integer.MAX_VALUE;
        for(int x =1;x*x<=n;x++){
            ans= Math.min(ans, solve(n-x*x, dp));
        }
        dp.set(n, dp.get(n)+ans);
        return dp.get(n);
    }
}
