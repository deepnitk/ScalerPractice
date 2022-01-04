public class Solution {
    void allPrime(int[] prime, int n){
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i*i<n;i++){
            if(prime[i]==0){
                for(int j=i*i;j<n;j+=i){
                    if(prime[j]==0) prime[j]=1;
                }
            }
        }
    }
    public int[] primesum(int A) {
        int[] prime = new int[A+1];
        allPrime(prime, A+1);
        for(int i=2;i<=A;i++){
            if(prime[i] == 0 && prime[A-i]==0)
                return new int[]{i,A-i};
        }
        return new int[0];
    }
}
