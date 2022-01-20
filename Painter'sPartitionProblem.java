public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
        long max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<C.size();i++){
            sum+=C.get(i);
            if(max<C.get(i)) max = C.get(i);
        }
        long l=(max*B),r=(sum*B);
        long ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            // mid*=B;
            if(check(C,mid,A,B)){
                ans= mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        ans%=10000003;
        return (int)ans;
    }
    boolean check(ArrayList<Integer> C, long mid, int A, int B){
            int painter=1;
            long curr_time=(1L*C.get(0)*B);
            for(int i=1;i<C.size();i++){
                if(curr_time + 1L*C.get(i)*B > mid){
                    painter++;
                    curr_time= (1L*C.get(i)*B);
                }
                else {
                    curr_time+= (1L*C.get(i)*B);
                }
            }
            if(painter<=A) return true;
            return false;
    }
}
