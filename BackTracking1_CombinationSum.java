public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(A);
        getCombinationSet(0,0,A,B,temp,res);
        return res;
    }

    void getCombinationSet(int i,int sum, ArrayList<Integer> A, int B, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res){
        if(sum == B && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(sum>B) return;
        
        for(int k=i;k<A.size();k++){
            int curr = A.get(k);
            temp.add(curr);
            sum+=curr;

            getCombinationSet(k, sum, A, B, temp, res);

            temp.remove(temp.size()-1);
            sum-=curr;
        }

    }
}
