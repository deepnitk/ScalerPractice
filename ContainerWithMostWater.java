public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int ans =0;
        if(A.size()<=1)
            return ans;
        int l=0,r=A.size()-1;
        while(l<r){
            int water = (r-l)*(Math.min(A.get(r),A.get(l)));
            ans = Math.max(ans,water);
            if(A.get(l)<A.get(r)) l++;
            else r--;
        }
        return ans;
    }
}
