public class Solution {
    public int solve(int A) {
        if(A == 1) return 1;
        int res = 0;
        int maxK = 0;
        while(Math.pow(5, maxK)<=A){
            maxK++;
        }
        maxK--;
        int amt = A;
        int k = maxK;
        while(amt>0 && k>=0){
            int deno = (int)Math.pow(5,k);
            int noOfCoins = amt/deno;
            res+=noOfCoins; 
            amt-=(deno*noOfCoins);
            k--;
        }
        return res;
    }
}
