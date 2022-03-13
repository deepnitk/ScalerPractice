public class Solution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Collections.sort(A);
        getPermutation(A, B, 0, 0, temp);
        return res;
    }

    public void getPermutation(ArrayList<Integer> A, int B, int i, int sum, ArrayList<Integer> temp){
            if(i == A.size()){
                if(sum == B && !res.contains(temp)){
                    res.add(new ArrayList<>(temp));
                }
                return;
            }
            
            sum+=A.get(i);
            temp.add(A.get(i));
            getPermutation(A,B, i+1, sum, temp);

            sum-=A.get(i);
            temp.remove(temp.size()-1);
            getPermutation(A,B, i+1, sum, temp);
        }
}
