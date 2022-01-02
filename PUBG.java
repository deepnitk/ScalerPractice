public class Solution {
    public int solve(ArrayList<Integer> A) {
        int ans = A.get(0);
        for(int i=1;i<A.size();i++){
            ans = gcd(ans, A.get(i));
        }
        return ans;
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
