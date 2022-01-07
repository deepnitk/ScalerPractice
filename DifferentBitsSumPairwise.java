public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        long ans=0;
        int n=A.size();
        for(int i=0;i<32;i++){
            int x =0;
            for(int j=0;j<n;j++){
                if((A.get(j)&(1<<i))>0) x++;
            }
            // System.out.println("ans"+ans);
            ans+=((long)x*(n-x)*2)%1000000007;
        }
        ans= ans%1000000007;
        return (int)ans;
    }
}
