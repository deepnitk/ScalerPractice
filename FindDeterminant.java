#You are given an N X N(where N = 2 or N = 3) 2D integer matrix A. You have to find the value of its determinant (det(A) or |A|).

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int n = A.length;
        int det = 0;
        if(n==2){
            det = A[0][0]*A[1][1] - A[0][1]*A[1][0];
        }
        else{
            det = A[0][0]*(A[1][1]*A[2][2] - A[2][1]*A[1][2]) 
                - A[0][1]*(A[2][2]*A[1][0] - A[2][0]*A[1][2]) 
                + A[0][2]*(A[1][0]*A[2][1] - A[2][0]*A[1][1]);
        }
        return det;
    }
}
