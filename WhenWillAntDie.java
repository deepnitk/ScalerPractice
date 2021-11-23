public class Solution {
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        Collections.sort(B);
        Collections.sort(C);
        int ans;
        if(C.size()==0)
            ans = B.get(B.size()-1)-0;
        else if(B.size()==0)
            ans = A- C.get(0);
        else
            ans = Math.max((A- C.get(0)), B.get(B.size()-1)-0);
        return ans;
    }

}
