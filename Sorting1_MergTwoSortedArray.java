public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        int n = A.size();
        int m = B.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int p1=0,p2=0,p3=0;
        while(p1<n && p2<m){
            if(A.get(p1)<=B.get(p2)){
                res.add(A.get(p1));
                p1++;
            } else {
                res.add(B.get(p2));
                p2++;
            }
        }
        while(p1<n){
            res.add(A.get(p1));
            p1++;
        }
        while(p2<m){
            res.add(B.get(p2));
            p2++;
        }
        return res;
    }
}
