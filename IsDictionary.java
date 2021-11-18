public class Solution {
    int[] table;
    public int solve(String[] A, String B) {
        table = new int[26];
        for(int i=0;i<B.length();i++) table[B.charAt(i)-'a'] = i;

      //Compare adjacent words
        for(int i=0; i< A.length-1;i++){
            if(isBigger(A[i],A[i+1])) return 0;
        }
        return 1;
    }
    private boolean isBigger(String s1, String s2){
        //compare the common part
        int length = Math.min(s1.length(), s2.length());
        for(int i=0; i<length;i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1!=c2) return table[c1-'a'] > table[c2 - 'a'];
        }
        // If no difference in common parts, check the length in case s1 = "apple", s2 = "app"
        return s1.length() > s2.length();

    }
}
