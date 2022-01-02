public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();

        ArrayList<Integer> prefixGcd = new ArrayList<Integer>(Collections.nCopies(n+2,0));
        prefixGcd.set(1, A.get(0));
        for(int i=2;i<=n;i++) prefixGcd.set(i,gcd(prefixGcd.get(i-1),A.get(i-1)));

        ArrayList<Integer> suffixGcd = new ArrayList<Integer>(Collections.nCopies(n+2,0));
        suffixGcd.set(n,A.get(n-1));
        for(int i=n-1;i>=1;i--) suffixGcd.set(i, gcd(suffixGcd.get(i+1),A.get(i-1)));

        int ans = Math.max(suffixGcd.get(2),prefixGcd.get(n-1));
        for(int i=2;i<n;i++){
            ans = Math.max(ans, gcd(prefixGcd.get(i-1),suffixGcd.get(i+1)));
        }
        return ans;
    }
    public int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
