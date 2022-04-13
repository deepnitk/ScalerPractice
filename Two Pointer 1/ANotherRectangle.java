public class Solution {
    public int solve(int[] A, int B) {
        int n=A.length;
        long b=B;
        int left=0;
        int right=n-1;
        int mod=1000000007;
        long count=0;
        while(left <n && right >=0){
            long area=(long)A[left]*(long)A[right];
            if(area < b){
                count=count+right+1;
                left++;
            }else{
                right--;
            }

        }
        return (int)(count%mod);
    }
}
