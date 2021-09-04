// Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
// If the given array contains a sub-array with sum zero return 1 else return 0.

public class Solution {
    public int solve(ArrayList<Integer> A) {
      // O(N^2) Solution
      //     for(int i=0;i<A.size();i++){
      //         int sum=0;
      //         for(int j=i; j<A.size();j++){
      //             sum+=A.get(j);
      //             if(sum == 0)
      //                 return 1;
      //         }
      //     }
      //     return 0;
        HashMap<Long, Integer> sumMap = new HashMap<Long, Integer>();
        sumMap.put(0L,1);
        // As A[i] is big as 10^9 we need to consider the edge case by declaring sum as Long
        long sum=0;
        for(int i=0; i<A.size();i++)
        {
            sum+=A.get(i);
            if(sumMap.containsKey(sum)){
                return 1;
            }   
            else{
                sumMap.put(sum, i);
            }
        }
        return 0;
    }
}
