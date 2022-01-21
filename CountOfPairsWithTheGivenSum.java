public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int l=0,r= A.size()-1;
        int count=0;
        while(l<r){
            int sum = A.get(l)+A.get(r);
            if(sum==B){
                count++;
                l++;
                r--;
            } else if(sum<B){
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}
