public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int ans= Integer.MAX_VALUE;
        boolean found = false;
        for(int i=0;i<A.size();i++){
            if(hm.containsKey(A.get(i))){
                ans = Math.min(ans, i-hm.get(A.get(i)));
                hm.put(A.get(i),i);
                found= true;
            }
            else {
                hm.put(A.get(i), i);
            }
        }
        if(found)
            return ans;
        return -1;
    }
}
