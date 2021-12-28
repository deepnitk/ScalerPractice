public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        int n = A.size();
        int m = A.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum= sum+(i+1)*(j+1)*(n-i)*(m-j)*A.get(i).get(j);
            }
        }
        return sum;
    }

}
