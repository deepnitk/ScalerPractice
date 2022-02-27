public class Solution {
    public int solve(ArrayList<Integer> A) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; 
        for(int i=0;i<A.size();i++){
            if(first<A.get(i)){
                second = first;
                first= A.get(i);
            }
            else if(second<A.get(i) && A.get(i)!=first) second= A.get(i);
        }
        if(second!= Integer.MIN_VALUE) return second;
        return 0;
    }
}
