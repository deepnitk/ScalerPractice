public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        if(n==1) return A.get(0);
        if(!(A.get(0).equals(A.get(1)))) return A.get(0);
        if(!A.get(n-2).equals(A.get(n-1))) return A.get(n-1);
        
        int l=1,r=n-2;
        while(l<=r){
            int mid = (l+r)/2;
            //target
            if(!(A.get(mid-1).equals(A.get(mid))) && !(A.get(mid+1).equals(A.get(mid)))) return A.get(mid);
            //first occuerence
            if(A.get(mid-1).equals(A.get(mid))) mid=mid-1;
            //search in left part
            if(mid%2==0) l=mid+2;
            //search in right part
            else r=mid-1;
        }
        return -1;
    }
}
