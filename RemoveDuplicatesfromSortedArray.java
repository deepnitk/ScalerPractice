public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int i = 0;
	    int n = A.size();
        if(n==0 || n==1)
            return A;
	    
	    for (int j = 1; j < n; j++) {
	        
	        if (A.get(j).intValue() != A.get(i).intValue()) {
                i++;
	            A.set(i, A.get(j));
	        }
	    }
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    for (int k = 0; k <=i; k++) {
	        arr.add(A.get(k));
	        
	    }
	    return arr;
    }
}
