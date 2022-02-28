public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        if(A.size()<1 || B==0) return 0;
        Collections.sort(A);
        int diff = Math.abs(A.get(0)-A.get(B-1));
        for(int i=1;i<A.size()-B;i++){
            int tempDiff = Math.abs(A.get(i)-A.get(i+B-1));
            diff = Math.min(diff, tempDiff);
        }
        return diff;
    }
}
