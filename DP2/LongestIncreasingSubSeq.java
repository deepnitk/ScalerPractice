public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lis(final int[] A) {
        return lisUtils(A);
    }

    private int lisUtils(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                    dp[i] = Math.max(dp[i], dp[j]);
            }
            dp[i] = dp[i]+1;
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,dp[i]);
        return ans;
    }
}
