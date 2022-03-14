public class Solution {
	public ArrayList<ArrayList<String>> solveNQueens(int A) {
        ArrayList<Integer> cols = new ArrayList<>(Collections.nCopies(A,0));
        ArrayList<Integer> leftDiagonals = new ArrayList<>(Collections.nCopies(2*A,0));
        ArrayList<Integer> rightDiagonals = new ArrayList<>(Collections.nCopies(2*A,0));
        ArrayList<Integer> currRes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> mat = 
            new ArrayList<ArrayList<Integer>>(Collections.nCopies(A, 
            new ArrayList(Collections.nCopies(A,0))));
        getCombinations(0, cols,leftDiagonals,rightDiagonals,mat, res, A, currRes);

        ArrayList<ArrayList<String>> result=new ArrayList<>();
        for(int i=0;i<res.size();i++) {
            ArrayList<Integer> cur=new ArrayList<>(res.get(i));
            ArrayList<String> re=new ArrayList<>();
            for(int j=0;j<cur.size();j++) {
                String s="";
                for(int l=0;l<A;l++) {
                    if(cur.get(j)==l) 
                        s+="Q";
                    else 
                        s+=".";
                }
                re.add(s);
            }   
            result.add(re);
        }   
        return result;
	}

    public void getCombinations(int idx, ArrayList<Integer> cols, ArrayList<Integer> leftDiagonals, 
        ArrayList<Integer> rightDiagonals, 
        ArrayList<ArrayList<Integer>> mat, ArrayList<ArrayList<Integer>> res, int n, ArrayList<Integer> currRes){

            if(idx == n){
                // we placed all our queens
                res.add(new ArrayList<>(currRes));
                return;

            }

            for(int j=0;j<cols.size();j++){
                if(cols.get(j)==1 || leftDiagonals.get(n+idx-j)==1 || rightDiagonals.get(idx+j)==1) 
                    continue;

                currRes.add(j);
                mat.get(idx).set(j, 1);
                cols.set(j,1);
                leftDiagonals.set(n+idx-j,1);
                rightDiagonals.set(idx+j,1);

                getCombinations(idx+1, cols,leftDiagonals,rightDiagonals,mat, res, n, currRes);

                currRes.remove(currRes.size()-1);
                mat.get(idx).set(j, 0);
                cols.set(j,0);
                leftDiagonals.set(n+idx-j,0);
                rightDiagonals.set(idx+j,0);
            }

        }
}
