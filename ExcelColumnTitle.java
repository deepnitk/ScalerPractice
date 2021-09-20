Given a positive integer A, return its corresponding column title as appear in an Excel sheet.

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while(n>0){
            int rem = (n%26);
            if(rem==0){
                res.append("Z");
                n = (n/26) - 1;
            }
            else{
                res.append((char)((rem-1)+'A'));
                n = n/26;
            }
        }
        res.reverse();
        return res.toString();
    }
}
