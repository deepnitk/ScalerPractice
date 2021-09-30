// Given an array of size N, Find the subarray with least average of size k.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        for(int i = 0; i< B; i++) sum+=A.get(i);
        int idx = 0;
        minSum = Math.min(sum, minSum);
        for(int i=B;i<A.size();i++){
            sum+=A.get(i);
            sum-=A.get(i-B);
            if(sum < minSum){
                minSum = sum;
                idx=i-B+1;
            }
        }
        return idx;
    }
}
