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

//Optimized solution

public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        int i = A.length -1;
        int j = B.length -1;
        int k = C.length -1;

        int minDiff, currentDiff, maxTerm;
        minDiff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))
                - Math.min(A[i], Math.min(B[j], C[k])));
        while(i != -1 && j != -1 && k != -1){
            currentDiff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))
                - Math.min(A[i], Math.min(B[j], C[k])));
            
            if(currentDiff < minDiff)
                minDiff = currentDiff;
            maxTerm = Math.max(A[i], Math.max(B[j] , C[k]));
            if(maxTerm == A[i]) i--;
            else if(maxTerm == B[j]) j--;
            else k--;
        }
        return minDiff;
    }
}

