Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A.size()== 0)
            return result;
        int N = 2*A.size() - 1;
        for(int i=0;i<N;i++){
            result.add(new ArrayList<Integer>(A.size()-1));
        }
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.size();j++){
                result.get(i+j).add(A.get(i).get(j));
            }
        }
        for(int i=0;i<N;i++){
            while(result.get(i).size()<A.size()){
                result.get(i).add(0);
            }
        }
        return result;
    }
}
