// Given an integer array A of size N.

// You can pick B elements from either left or right end of the array A to get maximum sum.

// Find and return this maximum possible sum.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int left = B-1;
        int right = A.size()-1;
        int leftSum =0;
        int rightSum = 0;
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<= B-1; i++){
            leftSum+=A.get(i);
        }
        while(left>=-1){
            ans = Math.max(ans, leftSum+rightSum);
            if(left!=-1)
                leftSum -= A.get(left);
            left--;
            if(right!=-1)
                rightSum += A.get(right);
            right--;
        }
        
        return ans;
    }
}
