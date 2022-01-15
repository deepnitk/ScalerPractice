public class Solution {
    public static int MOD = 1000000007;
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        long max_sum =0,min_sum =0;
        
        ArrayList<Long> temp = new ArrayList<Long>();
        temp.add(1L);
        for(int i=1;i<=n;i++) temp.add((2*temp.get(i-1))%MOD);

        for(int i=0;i<n;i++){
            max_sum += (A.get(i)*temp.get(i))%MOD;
            max_sum%=MOD;
            min_sum += (A.get(i)*temp.get(n-i-1))%MOD;
            min_sum%=MOD; 
        }
        return (int)(max_sum - min_sum + MOD)%MOD;
    }
}
