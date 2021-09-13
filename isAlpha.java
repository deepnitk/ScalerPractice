You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.

public class Solution {
    public int solve(ArrayList<Character> A) {
        for(int a:A){
            if(!(a>='a'&&a<='z') && !(a>='A'&&a<='Z')){
                return 0;
            }
        }
        return 1;
    }
}
