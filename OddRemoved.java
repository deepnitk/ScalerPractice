public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < a.size(); i++){
            res.add(new ArrayList<Integer>());
        }
        for(int i=0; i<a.size();i++){
            //res.add(new ArrayList<Integer>());
            for(int j=0;j<a.get(0).size();j++){
                if(a.get(i).get(j)%2 ==0) res.get(i).add((a.get(i).get(j)));
            }
        }
        return res;
    }
}
