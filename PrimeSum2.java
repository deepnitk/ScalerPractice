public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<A;i++){
            if(isPrime(i) && isPrime(A-i)){
                ans.add(i);
                ans.add(A-i);
                return ans;
            }
        }
        return ans;
    }

    public boolean isPrime(int a){
        for(int i=2;i*i<a;i++){
            if(a%i ==0) return false;
        }
        return true;
    }
}
