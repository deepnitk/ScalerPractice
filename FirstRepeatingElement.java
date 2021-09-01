// Given an integer array A of size N, find the first repeating element in it.

// We need to find the element that occurs more than once and whose index of first occurrence is smallest.

// If there is no repeating element, return -1.
  
 public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int ans = -1;
        for(int i=A.size()-1;i>=0; i--){
            if(freq.containsKey(A.get(i))){
                ans = A.get(i);
                continue;
            }
            else{
                freq.put(A.get(i), i);
            }
        }
        return ans;
    }
}
