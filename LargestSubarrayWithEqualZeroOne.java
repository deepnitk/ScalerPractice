
Given an array of integers A consisting of only 0 and 1.
Find the maximum length of a contiguous subarray with equal number of 0 and 1.
public class Solution {
    public int solve(int[] a) {
        int n= a.length;
        int sum = 0;
        int maxSize = 0;
        for(int i=0;i<n-1;i++){
            sum=(a[i]==0)?-1:1;
            for(int j=i+1;j<n;j++){
                if(a[j]==0) sum+=-1;
                else sum+=1;
                if(sum==0 && maxSize<j-i+1) {
                    maxSize=j-i+1;
                }
            }
        }
        return maxSize;

    }
}
