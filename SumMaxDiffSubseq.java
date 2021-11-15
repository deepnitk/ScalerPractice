Given an integer array A of size N.
You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, 
find the difference between the largest and smallest numbers in that subsequence Then add up all the differences to get the number.
public class Solution {
    public int solve(int[] a) {
        int MOD = 1000000007;
        Arrays.sort(a);
        int n = a.length;
        int minSum=0, maxSum=0;
        for(int i=0; i<n; i++){
            maxSum=2*maxSum+a[n-i-1];
            maxSum%=MOD;
            minSum= 2*minSum+a[i];
            minSum%=MOD;
        }
        return(maxSum-minSum+MOD)%MOD;
    }
}
