public class Solution {
    public int solve(int A) {
        if(A<10) return A;
        return solve(A/10) + A%10;
    }
}
