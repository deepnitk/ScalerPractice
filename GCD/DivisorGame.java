public class Solution {
    public int solve(int A, int B, int C) {
        int lcm = B * C / gcd(B,C);
        return A/lcm;
    }
    int gcd(int a, int b) {
        if ( a==0) {
        return b;
        }

        return gcd(b%a, a);
    }
}
