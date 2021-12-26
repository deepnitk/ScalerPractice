public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int sum =0, ans=0, maxSum = Integer.MIN_VALUE, l=0, r=A.size()-1, leftSum=0, rightSum=0;
        for(int i=0;i<B;i++) sum+=A.get(i);
        ans=sum;
        for(int i=1;i<=B;i++){
            sum = sum - A.get(B-i) + A.get(A.size()-i);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
