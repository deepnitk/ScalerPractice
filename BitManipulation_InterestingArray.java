public class Solution {
    public String solve(int[] A) {
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if((A[i] & 1) == 1){
                count++;
            }
        }
        if((count & 1) == 0){
            return "Yes";
        } else {
            return "No";
        }
    }

}
