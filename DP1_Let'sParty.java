public class Solution {
    public int solve(int A) {
        ArrayList<Integer> dp = new ArrayList<Integer>(Collections.nCopies(A+1, -1));
        dp.set(0,1);
        dp.set(1, 1);
        for(int i=2;i<=A;i++)
            dp.set(i, ((i-1)*dp.get(i-2)+dp.get(i-1))%10003);
        return dp.get(A);
    }
}
