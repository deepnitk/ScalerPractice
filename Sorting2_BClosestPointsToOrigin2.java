public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

         ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            Collections.sort(A, (a1, a2) -> {
                    long distA1 = a1.get(0)*a1.get(0) + a1.get(1)*a1.get(1);
                    long distA2 = a2.get(0)*a2.get(0) + a2.get(1)*a2.get(1);
                    if(distA1>=distA2)
                            return 1;
                    else
                            return -1;
            });
            for(int i=0;i<B;i++) {
                    res.add(A.get(i));
            }
            return res;
    }
}
