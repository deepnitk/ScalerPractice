// You are given a string S, and you have to find all the amazing substrings of S.
// Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).


public class Solution {
    public int solve(String A) {
        int count =0;
        for(int i=0; i<=A.length()-1; i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || 
                A.charAt(i)=='o' || A.charAt(i)=='u' || A.charAt(i)=='A' || A.charAt(i)=='E'||
                A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U'){
                    count+=(A.length()-i);
                }
        }
        return count%10003;
    }
}
