// You are given an array A of integers of size N.
// Your task is to find the equilibrium index of the given array
// Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
  
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int ls = 0;
        int rs = 0;
        for(int i=0; i< A.size();i++) rs+=A.get(i);
        
        for(int i=0; i< A.size();i++){
            rs-=A.get(i);
            if(ls==rs) return i;
            ls+=A.get(i);
        }
        return -1;
    }
}
