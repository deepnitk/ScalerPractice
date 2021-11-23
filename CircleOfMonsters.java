public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int curr =0;
        for(int i=0;i<A.size();i++){
            if(i== 0) curr+=Math.max(0, (A.get(i)-B.get(A.size()-1)));
            else curr+=Math.max(0, (A.get(i)-B.get(i-1)));
        }
        int ans = Integer.MAX_VALUE;
        for(int k=0;k<A.size();k++){
            if(k==0) ans = Math.min(ans, curr - Math.max(0, A.get(k)- B.get(A.size()-1)) + A.get(k));
            else ans = Math.min(ans, curr - Math.max(0, A.get(k)- B.get(k-1)) + A.get(k));
        }
        return ans%1000000007;
    }
}
