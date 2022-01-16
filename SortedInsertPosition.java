public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {
        int l=0;
        int r=A.size()-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid)==B) return mid;
            else if(A.get(mid)<B) l=mid+1;
            else r = mid-1;
        }
        return r+1;
    }
}
