Given a string A, you are asked to reverse the string and return the reversed string.

public class Solution {
    public String solve(String A) {
        if(A.length()==1)
            return A;
        char[] tempArray = A.toCharArray();
        int r= tempArray.length-1;
        for(int l=0; l<r; l++,r--){
            char temp = tempArray[l];
            tempArray[l] = tempArray[r];
            tempArray[r] = temp;

        }
        return new String(tempArray);
    }
}
