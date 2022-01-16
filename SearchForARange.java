public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(A.size()==1 && A.get(0)==B){
            res.add(0);
            res.add(0);
            return res;
        }

        int l=0,r=A.size()-1;
        int first=-1,last=-1;
        first = findFirst(A,l,r,B);
        if(first != -1)
            last = findLast(A,first, r, B);
        res.add(first);
        res.add(last);
        return res;
    }

    public static int findFirst(List<Integer> A, int l, int r, int x){
        int idx = -1;
        while(l<=r){
            int mid=(l+r)/2;
            if(A.get(mid)==x){
                idx= mid;
                r=mid-1;
            }
            else if(A.get(mid)<x) l=mid+1;
            else r = mid-1;
        }
        return idx;
    }

    public static int findLast(List<Integer> A, int l, int r, int x){
        int idx=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(A.get(mid)==x){
                idx=mid;
                l=mid+1;
            }
            else if(A.get(mid)<x) l=mid+1;
            else r = mid-1;
        }
        return idx;
    }
}
