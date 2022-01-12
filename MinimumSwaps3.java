public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<=B) count++;
        }
        int bad = 0;
        for(int i=0; i<count;i++){
            if(A.get(i)>B) ++bad;
        }

        int ans = bad;
        for(int i=0,j=count;j<A.size();++i,++j){
            if(A.get(i)>B) --bad;
            if(A.get(j)>B) ++bad;
            ans= Math.min(ans, bad);
        }
        return ans;
    }
}
