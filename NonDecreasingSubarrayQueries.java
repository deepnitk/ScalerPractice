public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> pfSum = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        pfSum.add(0,0);
        for(int i=2;i<=A.size();i++){
            if(A.get(i-1)<A.get(i-2)) pfSum.add(pfSum.get(i-2)+1);
            else pfSum.add(pfSum.get(i-2)+0);
        }
        int m = B.size();
        for(int i=0;i<m;i++){
            int l = B.get(i).get(0);
            int r = B.get(i).get(1);
            int indicator = pfSum.get(r-1)- pfSum.get(l-1);
            if(indicator>0)
                res.add(0);
            else
                res.add(1);

        }
        return res;
    }

}
