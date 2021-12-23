public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        List<Integer> leftMax = new ArrayList<Integer>(Collections.nCopies(A.size(), 0));
        List<Integer> rightMax = new ArrayList<Integer>(Collections.nCopies(A.size(), 0));
        int rightMaxValue = Integer.MIN_VALUE;
        int leftMaxValue = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)> leftMaxValue){
                leftMax.set(i,A.get(i));
                leftMaxValue = A.get(i);
            } 
            else leftMax.set(i,leftMax.get(i-1));
        }
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)> rightMaxValue){
                rightMax.set(i,A.get(i));
                rightMaxValue = A.get(i);
            } 
            else rightMax.set(i,rightMax.get(i+1));
        }
        
        int water = 0;
         for(int i=0;i<A.size();i++){
             water+=Math.min(leftMax.get(i), rightMax.get(i)) - A.get(i);
         }
         return water;
    }
}
