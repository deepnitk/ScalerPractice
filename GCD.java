public class Solution {
    public int gcd(int a, int b) {
        if(a>b) swap(a,b);
        while (a>0){
            int temp = a;
            a= b%a;
            b=temp;
        }
        return b;
    }
    public void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
