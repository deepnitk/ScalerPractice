Given a string A, rotate the string B times in clockwise direction and return the string.
  
 public class Solution {
    public String solve(String A, int B) {
        StringBuilder str = new StringBuilder();
        B=B%A.length();
        for(int i=A.length()-B; i<=A.length()-1;i++)
            str.append(A.charAt(i));
        for(int i=0;i<=A.length()-1-B;i++)
            str.append(A.charAt(i));
        return str.toString();
    }
}
