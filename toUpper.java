Convert each charater of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.

public class Solution {
    public char[] to_upper(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>='a' && A[i]<='z')
                A[i]= (char)((int)A[i]-32);
        }
        return A;
    }
}
