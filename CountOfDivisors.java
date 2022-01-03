public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<Integer>(Collections.nCopies(n, 0));
        for(int i=0;i<n;i++){
            countDivisors(i,A.get(i),ans);
        }
        return ans;
    }
    public void countDivisors(int pos, int a, ArrayList<Integer> ans) {
        int count =0;
        for(int i=1;i*i<=a;i++) {
            if(a%i==0){
                count++;
                if(i!=a/i) count++;
            }
        }
        ans.set(pos, count);
    }
}
