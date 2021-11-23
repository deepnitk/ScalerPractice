public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) res.add(A.get(i));
        for(int i=0;i<B.size();i++) res.add(B.get(i));
        Collections.sort(res);
        return res;
    }
}
