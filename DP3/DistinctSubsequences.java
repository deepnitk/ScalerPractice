//Recursive Solution
//TC: exponential
//SC: exponential
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        return numDistinctUtils(n-1, m-1, s, t);
    }
    
    private int numDistinctUtils(int i, int j, String s1, String s2){
        if(j<0) return 1;
        if(i<0) return 0;
        
        if(s1.charAt(i) == s2.charAt(j))
            return numDistinctUtils(i-1, j-1, s1, s2) + numDistinctUtils(i-1, j, s1, s2);
        else
            return numDistinctUtils(i-1, j, s1, s2);
    }
}
