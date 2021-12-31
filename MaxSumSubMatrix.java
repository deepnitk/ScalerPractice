public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        int m = A.get(0).size();
        ArrayList<ArrayList<Integer>> colPf = new ArrayList<ArrayList<Integer>>();
        Collections.nCopies(n+1, new ArrayList(Collections.nCopies(m+1, 0))).forEach((pf1) -> colPf.add(new ArrayList(pf1)));


        for(int i=1;i<colPf.size();i++){
            for(int j=1;j<colPf.get(0).size();j++){
                colPf.get(i).set(j, A.get(i-1).get(j-1)+colPf.get(i-1).get(j)+colPf.get(i).get(j-1)-colPf.get(i-1).get(j-1));
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<colPf.size();i++){
            for(int j=1;j<colPf.get(0).size();j++){
                int sum= Integer.MIN_VALUE;
                if(i-B >=0 && j-B >= 0){
                    sum = colPf.get(i).get(j) - colPf.get(i-B).get(j) - colPf.get(i).get(j-B) + colPf.get(i-B).get(j-B);
                    maxSum = Math.max(sum,maxSum);
                }
            }
        }

        return maxSum;
    }
}
