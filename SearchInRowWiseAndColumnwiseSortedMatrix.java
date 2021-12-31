public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        int m = A.get(0).size();
        int i=0,j=m-1;
        boolean found = false;
        int ans = Integer.MAX_VALUE;
        while(i<n && j>=0){
            int curr = A.get(i).get(j);
            if(curr==B) {
                int e = (((i+1)*1009)+(j+1));
                ans = Math.min(ans,e);
                found = true;
                j--;
            }
            else if(curr<B) i++;
            else j--;
        }
        if(found) return ans;
        else return -1;

    }
}
