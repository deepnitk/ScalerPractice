public class Solution {
    public int solve(int A) {
        ArrayList<Integer> spf = new ArrayList<Integer>(Collections.nCopies(A+1,0));
        for(int i=2;i<=A;i++){
            for(int j=2*i;j<=A;j+=i){
                if(isPrime(i) && j%i==0){
                    spf.set(j,spf.get(j)+1);
                }
            }
        }
        int count =0;
        for(int i=2;i<=A;i++){
            if(spf.get(i)==2) count++;
        }
        return count;
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}
