//Brute Force Solution
public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j =0;j<B.length;j++){
                for(int k=0;k<C.length;k++){
                    int maxDiff = Math.max(A[i],Math.max(B[j],C[k]));
                    int minDiff = Math.min(A[i],Math.min(B[j],C[k]));
                    res = Math.min(res, Math.abs(maxDiff-minDiff));
                }
            }
        }
        return res;
    }
}
