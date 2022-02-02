public class Solution {
    public int solve(ArrayList<Integer> A) {
        int result = 0;
        boolean even = A.get(0)%2==0?true:false;
        boolean odd = A.get(0)%2!=0?true:false;
        for(int i=0;i<A.size();i++){
            if(A.get(i)%2==0 && even){
                result++;
                even=false;
                odd=true;
            } else if(A.get(i)%2!=0 && odd) {
                result++;
                even=true;
                odd=false;
            }
        }
        return result;
    }
}
