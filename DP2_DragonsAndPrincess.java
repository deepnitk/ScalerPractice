public class Solution {
    public int calculateMinimumHP(ArrayList<ArrayList<Integer>> A) {
        int minEnergy = 0;
        int m = A.size();
        int n = A.get(0).size();
        ArrayList<ArrayList<Integer>> dp = 
            new ArrayList<ArrayList<Integer>>(Collections.nCopies(m+1, new ArrayList(Collections.nCopies(n+1, 1))));

        for(int i=m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                int min = Math.min(dp.get(i+1).get(j), dp.get(i).get(j+1));
                if(i+1>=m && j+1<=n) min = dp.get(i).get(j+1);
                if(i+1<=m && j+1>=n) min = dp.get(i+1).get(j);
                dp.get(i).set(j, Math.max(min - A.get(i).get(j), 1));
            }
        }
        return dp.get(0).get(0);

    }
}
