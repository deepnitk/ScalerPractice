public class Solution {
    public String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int s=0;
        String ans="";
        while(i>=0 || j>=0 || s==1){
            s += ((i >= 0)? A.charAt(i) - '0': 0);
            s += ((j >= 0)? B.charAt(j) - '0': 0);

            ans = (char)(s%2 +'0')+ans;

            s=s/2;
            i--;j--;
        } 
        return ans;
    }
    
}
