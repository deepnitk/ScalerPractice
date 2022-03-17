public class Solution {
    public int climbStairs(int A) {
        ArrayList<Integer> ways = new ArrayList<>(Collections.nCopies(A+1, 1));
        if(A==1){
            return 1;
        }
        
        ways.set(1, 1);
        ways.set(2, 2);
        
       
        for(int i=3;i<=A;i++){
            ways.set(i, ways.get(i-1)+ ways.get(i-2));
        }
        return ways.get(A);
    }
}
