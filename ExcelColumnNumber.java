Given a column title as appears in an Excel sheet, return its corresponding column number.

public class Solution {
    public int titleToNumber(String A) {
        int result =0;
        for(int i = 0; i<A.length(); i++)
        {
            result= result*26+(A.charAt(i)+1-'A');
        }
        return result;
    }
}
