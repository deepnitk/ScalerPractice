Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.
Note: A palindrome is a string that's the same when reads forwards and backwards.
  
public class Solution {
    public int solve(String A) {
        return isPal(A,0,A.length() -1);
    }
    public static int isPal(String s, int l, int r){
        if(l>=r)
            return 1;
        if(s.charAt(l)== s.charAt(r)){
            return isPal(s,l+1,r-1);
        }
        else
            return 0;
    }
}
