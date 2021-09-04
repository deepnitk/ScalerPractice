// Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.
// Return the count modulo 109 + 7.
  
public class Solution {
    public int solve(int n) {
        if(n==0)
            return 0;
        long p=0;
        long ans=0;
        while((Math.pow(2,p)<=n)){
            p++;
        }
        p--;
        System.out.println("p:"+p);
        ans+=(p*Math.pow(2,p))/2+(n-(int)Math.pow(2,p))+1+solve(n-(int)Math.pow(2,p));
        System.out.println("ans:"+ans);
        ans%=1000000007;
        return (int)ans;
    }
}
