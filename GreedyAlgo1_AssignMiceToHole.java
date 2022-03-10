public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int res =0;
        for(int i=0;i<A.size();i++){
            res=Math.max(res,(Math.abs(A.get(i)-B.get(i))));
        }
        return res;
    }
}
