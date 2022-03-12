public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        getPermutations(0,A.size(), A, res);
        return res;
    }

    void getPermutations(int i, int n, ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res){
            if(i==n) {
                res.add(new ArrayList<>(A));
                return;
            }

            for(int l = i;l<n;l++){
                Swap(A, i, l);
                getPermutations(i+1, n, A, res);
                Swap(A, i, l);
            }
    }

    void Swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

}
