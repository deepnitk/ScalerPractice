public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int n1 = A.size();
        int n2 = B.size();
        // ArrayList<Integer> pfSum = new ArrayList<Integer>();
        int[] pfSum = new int[n1+1];
        pfSum[0]=0;;
        int k;
        for(k=0;k<n1;k++){
            pfSum[k+1]=pfSum[k]+A.get(k);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n2;i++){
            int l = B.get(i).get(0);
            int r = B.get(i).get(1);
            ArrayList<Integer> row = new ArrayList<Integer>();
            int lenOfSubarray = r-l+1;
            int noOfOnes = pfSum[r] -pfSum[l-1];
            if(noOfOnes%2==0) row.add(0);
            else if(noOfOnes%2!=0) row.add(1);


            int noOfZeros = lenOfSubarray - noOfOnes;
            row.add(noOfZeros);
            res.add(row);
        }
        return res;

    }
}
