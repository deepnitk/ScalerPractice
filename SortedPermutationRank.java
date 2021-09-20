Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003

public class Solution {
    public int findRank(String A) {
        int len = A.length();
        int rank = 1;
        int countRight;
        
        for(int i=0; i<len-1;i++){
            countRight=0;
            for(int j=i+1;j<len;j++){
            if(A.charAt(j)<A.charAt(i))
                ++countRight;                
            }
            rank += ( (countRight*fact(len-i-1)) )%1000003;
        }
        return rank%1000003;
    }
    
    public static int fact(int n){
        return (n<=1)?1:(n*fact(n-1))%1000003;
    }
}
