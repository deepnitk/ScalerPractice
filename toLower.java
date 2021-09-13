Convert each charater of A into lowercase character if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z is converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.
  
public class Solution {
    public char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>='A' && A[i]<='Z')
                A[i]= (char)((int)A[i]+32);
        }
        return A;
    }
}
