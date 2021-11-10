You are given a 2D integer matrix A, return a 1D integer vector containing column-wise sums of original matrix.
public class Solution {
    public int[] solve(int[][] A) {
        int[] res = new int[A[0].length];
        int m= A.length;
        int n = A[0].length;
        int sum =0;
        for (int i =0 ; i< n;i++){
            for(int j=0; j< m;j++){
                sum=sum+A[j][i];
            }
            res[i]=sum;
            sum =0;
        }
        return res;
    }
}
