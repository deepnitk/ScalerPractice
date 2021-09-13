You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z and 0-9), else return 0.

public class Solution {
    public int solve(ArrayList<Character> A) {
        for(int a:A){
            if(!(a>='a'&&a<='z') && !(a>='A'&&a<='Z') && !(a>='0' &&a<='9')){
                return 0;
            }
        }
        return 1;
    }
}
