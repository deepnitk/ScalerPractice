Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
 
 public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<=A.size()-1;i++){
            if(i<A.size()-1 && A.get(i).equals(A.get(i+1)))
                continue;
            if(A.get(i)==(A.size()-i-1)){
                return 1;
            }
        }
        return -1;
    }
}
