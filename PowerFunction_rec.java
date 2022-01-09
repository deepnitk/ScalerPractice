public class Solution {
    public int pow(int a, int n, int k) {
        if(a==0) return 0;
        if(n==0) return 1;
        long p;
        if(n%2==0){
            p=pow(a, n/2,k);
            p=(p*p)%k;
        } 
        else {
            p=a%k;
            p= (p*pow(a, n-1,k)%k)%k;
        }
        return (int)(p+k)%k;

    }
}
