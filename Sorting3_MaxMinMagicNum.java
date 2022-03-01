public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A);
        long min =0, max =0;
        int n=A.size();
        int MOD = 1000000007;
        for(int i=0;i<n/2;i++){
            max+=(Math.abs(A.get(i)-A.get(n-i-1)));
            max%=MOD;
        }
        for(int i=0;i<n-1;i+=2){
            min+=(Math.abs(A.get(i)-A.get(i+1)));
            min%=MOD;
        }
        return new ArrayList(Arrays.asList((int)max,(int)min));
    }
}
