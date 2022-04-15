public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        int i = 0;
        int j = B.length - 1;
        int[] res = new int[2];
        int k = A[0];
        int prev = Math.abs(A[i] + B[j] - C);
        while (i < A.length && j >= 0) {
            int l = A[i];
            int r = B[j];
            int current = Math.abs((l + r) - C);
            if (current < prev) {
                prev = current;
                k = A[i];
            }
            if (current == prev && A[i] == k) {
                res[1] = B[j];
            }

            if ((l + r) < C) {
                i++;
            } else {
                j--;
            }
            res[0] = k;
        }
        return res;
    }
}
