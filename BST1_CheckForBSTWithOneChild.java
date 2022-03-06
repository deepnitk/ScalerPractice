public class Solution {
    public String solve(ArrayList<Integer> A) {
        return verify(A, 0, Integer.MIN_VALUE, Integer.MAX_VALUE) ? "YES" : "NO";
    }
    private boolean verify(ArrayList<Integer> A, int i, int min, int max) {
        if(i == A.size()) return true;
        if(A.get(i) >= min && A.get(i) <= max) {
            int val = A.get(i);
            return verify(A, i + 1, min, val - 1) || verify(A, i + 1, val + 1, max);
        } else return false;
    }
}
