public class Solution {
    public String solve(String A) {
        int diffCount = 0;
        int l=0;
        int r= A.length()-1;
        while(l<=r){
            if(A.charAt(l)!= A.charAt(r))
                diffCount++;
            l++;
            r--;
        }
        int len = A.length();
        if(len%2 == 0 && diffCount ==1) return "YES";
        if(len%2 != 0 && (diffCount ==0 || diffCount ==1)) return "YES";
        return "NO";
    }
}
