Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.
  
public class Solution {
    public int isPalindrome(int A) {
        int temp = A;
        int r, sum=0;
        while(A>0){
            r=A%10;
            sum=(sum*10)+r;
            A=A/10;
        }
        if(temp==sum)
            return 1;
        else
            return 0;
    }
}
