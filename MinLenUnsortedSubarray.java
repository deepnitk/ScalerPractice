You are given an integer array A having N integers.
You have to find the minimum length subarray A[l..r] such that sorting this subarray makes the whole array sorted.

public class Solution {
    public int solve(int[] a) {
        int s=0, e= a.length -1, max, min,i;
        int n=a.length;
        for(s=0;s<n-1;s++){
            if(a[s]>a[s+1]) break;
        }
        if(s==n-1) return 0;
        for(e=a.length-1;e>0; e--){
            if(a[e]<a[e-1]) break;
        }
        max = a[s];
        min = a[s];
        for(i=s;i<=e;i++){
            if(a[i]<min) min = a[i];
            if(a[i]>max) max = a[i];
        }
        for(i=0;i<s-1;i++){
            if(a[i]>min) {
                s=i;
                break;
            }
        }
        for(i=n-1;i>e;i--) {
            if(a[i]<max) {
                e=i;
                break;
            }
        }
        
        return e-s+1;
    }
}
