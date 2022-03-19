public class Solution {
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n = A.get(0).size();

        ArrayList<ArrayList<Integer>> dp = 
            new ArrayList<ArrayList<Integer>>(Collections.nCopies(m, new ArrayList(Collections.nCopies(n,-1))));
            
        //if first cell or last cell is blocked return 0
        if(A.get(0).get(0) == 1 || A.get(m-1).get(n-1) == 1) return 0;

    
        //construct dp array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //base conditions
                if(A.get(i).get(j)==1){
                    dp.get(i).set(j,0);
                    continue;
                }
                if(i==0 && j==0){
                    dp.get(i).set(j,1);
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i>0)
                    up = dp.get(i-1).get(j);
                if(j>0)
                    left = dp.get(i).get(j-1);
                dp.get(i).set(j, up+left);
            }
        }
        return dp.get(m-1).get(n-1);
    }
}
