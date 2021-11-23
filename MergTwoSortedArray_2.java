public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int m = A.size();
        int n = B.size();
        if(m==0 && n ==0){
            return res;
        }
        if(m==0){
            for(int i=0;i<n;i++){
                res.add(B.get(i));
                return res;
            }
        }
        if(n==0){
            for(int i=0;i<m;i++){
                res.add(A.get(i));
                return res;
            }
        }
        int i, j;
        int k = 0;
        for (i = 0, j = 0; k < m + n; k++) {
            if (i >= m)
                res.add(B.get(j++));
            else if (j >= n)
                res.add(A.get(i++));
            else if (A.get(i) <= B.get(j))
                res.add(A.get(i++));
            else
                res.add(B.get(j++));
        }
        return res;
    }
}
