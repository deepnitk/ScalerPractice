// Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element 
// from these indices makes the sum of even-indexed and odd-indexed array elements equal.

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int count =0;
        int lo =0;
        int le = 0;
        int ro = 0;
        int re =0;
        
        for(int i =0;i< A.size(); i++){
            if(i%2==0)
                re+=A.get(i);
            else if(i%2!=0)
                ro+=A.get(i);
        }
        
        for(int i =0;i< A.size(); i++){
            if(i%2!=0) ro-=A.get(i);
            else re-=A.get(i);
            if(lo+re == le+ro) count++;
            if(i%2!=0) lo+=A.get(i);
            else le+=A.get(i);
        }
        return count;
        
    }
}
