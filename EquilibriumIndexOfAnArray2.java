public class Solution {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefixSum = new ArrayList<Integer>(Collections.nCopies(A.size(),0));
        ArrayList<Integer> prefixSumReverse = new ArrayList<Integer>(Collections.nCopies(A.size(),0));
        prefixSum.set(0,A.get(0));
        prefixSumReverse.set(A.size()-1, A.get(A.size()-1));
        for(int i=1;i<A.size();i++){
            prefixSum.set(i,A.get(i)+prefixSum.get(i-1));
        }
        for(int i=A.size()-2;i>=0;i--){
            prefixSumReverse.set(i,A.get(i)+prefixSumReverse.get(i+1));
        }
        for(int i=0;i<A.size();i++){
            if(prefixSum.get(i)==prefixSumReverse.get(i)) return i;
        }

        return -1;
    }
}
