public class Solution {
    private static int MOD = 1000000007;
    public int solve(int A) {
        ArrayList<Integer> dp = new ArrayList<Integer>(Collections.nCopies(A+1, -1));
        dp.set(0,1);
        for(int i=1;i<=A;i++){
            long sum = 0;
            for(int j=1;j<=6;j++){
                if(j<=i){
                    sum+=dp.get(i-j);
                    sum%=MOD;
                }
            }
            dp.set(i,(int) sum);
        }
        return dp.get(A);
    }
}
