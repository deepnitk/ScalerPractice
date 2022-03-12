public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<>());
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(A);
        getSubSets(0,A.size(),A,temp, res);
        return res;
    }
    
    void getSubSets(int i, int n, ArrayList<Integer> A, 
       ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res){
        
        if(i==n) return;

        temp.add(A.get(i));
        res.add(new ArrayList<Integer>(temp));
        getSubSets(i+1,n,A, temp, res);

        temp.remove(temp.size()-1);
        getSubSets(i+1, n,A, temp, res);
        


    }
}
