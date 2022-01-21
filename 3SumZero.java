public class Solution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            utility(A,i);
        }
        Set<ArrayList<Integer>> set = new LinkedHashSet<ArrayList<Integer>>();
        set.addAll(res);
        res.clear();
        res.addAll(set);
        return res;
    }
    public void utility(ArrayList<Integer> A, int i) {
        int l=i+1,r= A.size()-1;
        while(l<r){
            int sum = A.get(l)+A.get(r)+A.get(i);
            if(sum==0){
                ArrayList<Integer> triplet = new ArrayList<Integer>();
                triplet.add(A.get(i));
                triplet.add(A.get(l));
                triplet.add(A.get(r));
                res.add(triplet);
                l++;
                r--;
            } else if(sum<0){
                l++;
            } else {
                r--;
            }
        }
    }
}
