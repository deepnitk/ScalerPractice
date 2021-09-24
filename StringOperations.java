// Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

// Concatenate the string with itself.
// Delete all the uppercase letters.
// Replace each vowel with '#'.
// You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
public class Solution {
    public String solve(String A) {
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || 
                    A.charAt(i)=='i' || A.charAt(i)=='o'|| A.charAt(i)=='u'){
                    res.append("#");
                }
                else{
                    res.append(A.charAt(i));
                }
            }
        }
        res.append(res);
        return res.toString();
    }
}
