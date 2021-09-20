You are given an integer N and the task is to reverse the digits of the given integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer

public class Solution {
    public int reverse(int A) {
        return reverseInt(A);
    }
    public static int reverseInt(int A){
        int temp=0;
        int top = Integer.MAX_VALUE/10;
        int bottom = Integer.MIN_VALUE/10;
        while(Math.abs(A)>0){
            if(temp>top || temp<bottom)
                return 0;
            temp = temp*10 + A%10;
            A= A/10;
        }
        return temp;
    }
}
