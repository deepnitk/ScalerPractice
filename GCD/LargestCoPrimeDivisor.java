public class Solution {
    public int cpFact(int A, int B) {
        if(gcd(A,B) == 1){
            return A;
        }
        return cpFact(A/gcd(A,B),B);
    }

    int gcd(int A,int B){
        if(A == 0)
            return B;
        return gcd(B % A,A);
    }
}
