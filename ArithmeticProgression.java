Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

public class Solution {
    public int solve(ArrayList<Integer> A) {
        if(A.size()<=2){
            return 1;
        }
        Collections.sort(A);
        int d = A.get(1)-A.get(0);
        for(int i=0;i<A.size();i++){
            if(i<A.size()-1 && A.get(i+1)-A.get(i)!=d ){
                return 0;
            }
        }
        return 1;
    }
}
