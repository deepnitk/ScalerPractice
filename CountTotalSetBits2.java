public class Solution {
    public int solve(int A) {
        if(A==0)return 0;
        long ans = 0;
        int x = findGreatePowerOf2(A);
        ans = ((1<<(x-1))*1L*x) + ((A-(1<<x)+1L)) + (solve(A-(1<<x)));
        ans%=1000000007;
        return (int)ans;
    }

    static int findGreatePowerOf2(int n){
        int x =0;
        while((1<<x) <= n) x++;
        return x-1;
    }
}
