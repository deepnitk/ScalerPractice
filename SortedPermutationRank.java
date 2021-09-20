Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003

public class Solution {
    public int findRank(String A) {
        int len = A.length();
        int mul = fact(len);
        int rank = 1;
        int countRight;
        
        for(int i=0;i<len;++i){
            mul/=len-i;
            countRight = findSmallerInRight(A,i,len-1);
            rank = (rank%1000003 + (countRight*mul)%1000003)%1000003;
        }
        return rank;
    }
    
    public static int fact(int n){
        return (n<=1)?1:n*fact(n-1);
    }
    
    public static int findSmallerInRight(String s, int l, int r){
        int countRight = 0;
        for(int i=l+1;i<=r;++i){
            if(s.charAt(i)<s.charAt(l))
                ++countRight;
        }
        return countRight;
    }
}
