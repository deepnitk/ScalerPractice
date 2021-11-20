public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<n;i++) 
            ans = Math.min(ans, A.get(i)-A.get(i-1));
        return ans;
    }
}
