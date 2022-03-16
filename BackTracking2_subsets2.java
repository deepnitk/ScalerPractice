public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<>());
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(A);
        getSubSets(0, A.size(), A, res, temp);
        return res;
    }
    private void getSubSets(int index, int n, ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp){
        if(index == n) return;

        temp.add(A.get(index));
        if(!res.contains(temp))
            res.add(new ArrayList<>(temp));
        getSubSets(index+1, A.size(), A, res, temp);

        temp.remove(temp.size()-1);
        getSubSets(index+1, A.size(), A, res, temp);
    }
}
