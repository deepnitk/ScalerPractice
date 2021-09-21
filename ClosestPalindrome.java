// Groot has a profound love for palindrome which is why he keeps fooling around with strings.
// A palindrome string is one that reads the same backward as well as forward.

// Given a string A of size N consisting of lowercase alphabets, he wants to know if it is possible to make the given string a palindrome by changing exactly one of its character.

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
