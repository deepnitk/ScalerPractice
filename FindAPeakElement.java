public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        if(n==1) return A.get(0);
        if(A.get(0)>=A.get(1)) return A.get(0);
        if(A.get(n-1)>=A.get(n-2)) return A.get(n-1);
        int l=1, r=n-2;
        while(l<=r){
            int mid =(l+r)/2;
            if(A.get(mid-1)<A.get(mid) && A.get(mid+1)<A.get(mid)) return  A.get(mid);
            else if( A.get(mid+1)>A.get(mid)) l=mid+1;
            else r = mid-1;
        }
        return -1;
    }
}
