Given an integer array A of size N. In one operation, you can remove any element from the array, and the cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
  
public class Solution {
    public int solve(ArrayList<Integer> A) {
        if(A.size()==1)
            return A.get(0);
        Collections.sort(A, Collections.reverseOrder());
        int minCost =0;
        int total = 0;
        for(int i=0;i<A.size();i++){
            total+=A.get(i);
        }
        int initialSum = total;
        for(int i=0;i<A.size();i++){
            minCost += ((total-A.get(i)));
            total-=A.get(i);
        }
        return initialSum + minCost;
    }
}
