// Tabulation approach
// Time Complexity: O(N)
// Reason: We are running a simple iterative loop
// Space Complexity: O(N)
// Reason: We are using an external array of size ‘n+1’.

public class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<A.get(0).size();i++){
            arr.add(Math.max(A.get(0).get(i), A.get(1).get(i)));
        }
        int n = arr.size(); 
        return getMaxSum(n, arr);
    }
    
    private int getMaxSum(int n, ArrayList<Integer> arr){
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n, -1));
        dp.set(0,arr.get(0));
        for(int i=1;i<n;i++){
            int pick = arr.get(i);
            if(i>1) pick+=dp.get(i-2);
            int dontPick = dp.get(i-1);
            dp.set(i, Math.max(pick, dontPick));
        }
        return dp.get(n-1);
    }

}
