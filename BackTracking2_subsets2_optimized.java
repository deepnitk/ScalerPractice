public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        getSubSets(0, A.size(), A, res, new ArrayList<>());
        return res;
    }
    private void getSubSets(int index, int n, ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i= index;i<n;i++){
            if(i!= index && A.get(i )== A.get(i-1)) continue;
            temp.add(A.get(i));
            getSubSets(i+1, A.size(), A, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}

// TC: O(2^N * N)
// SC: O(2^N) * O(K)
