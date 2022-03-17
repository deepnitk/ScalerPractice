// Recursive solution
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

//Iterative solution
public class Solution {
    
    public int countMinSquares(int A) {
        ArrayList<Integer> dp = new ArrayList<Integer>(Collections.nCopies(A+1, -1));
        dp.set(0,0);
        dp.set(1,1);
        for(int i=2;i<=A;i++){
            dp.set(i,i);
            for(int x=1;x*x<=i;x++){
                dp.set(i, Math.min(dp.get(i), 1+ dp.get(i-x*x)));
            }
        }
        return dp.get(A);
    }

   
}
// T.C: O(N*sqrt(N))
// S.c: O(N)
