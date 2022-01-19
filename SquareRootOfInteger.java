public class Solution {
    public int sqrt(int A) {
        long l=1, r=A;
        long ans=0;
        while(l<=r){
            long mid = (l+r)/2;
            if(mid*mid == A) return (int)mid;
            else if(mid*mid<A){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return (int)ans;
    }
}
