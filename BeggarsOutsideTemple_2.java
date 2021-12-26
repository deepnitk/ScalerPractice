public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int n = B.size();
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(A, 0));
        
        for(int i=0;i<B.size();i++){
            int amt = B.get(i).get(2);
            int start = B.get(i).get(0) -1;
            int end = B.get(i).get(1) -1;
            ans.set(start, ans.get(start)+amt);
            if(end<A-1) ans.set(end+1, ans.get(end+1)-amt);   
        }

        for(int i=1;i<ans.size();i++){
            ans.set(i, ans.get(i)+ans.get(i-1));
        }
        return ans;
    }
}
