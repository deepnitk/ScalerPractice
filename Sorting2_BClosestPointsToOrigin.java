public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        ArrayList<Integer> distance = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            int x = A.get(i).get(0);
            int y = A.get(i).get(1);
            distance.add((x * x) + (y * y));
        }

        Collections.sort(distance);

        int distanceB = distance.get(B-1);
        for(int i=0;i<n;i++){
            int x = A.get(i).get(0);
            int y = A.get(i).get(1);
            int dist = (x * x) + (y * y);
            if(dist <= distanceB){
                ArrayList<Integer> row = new ArrayList<Integer>();
                row.add(x);
                row.add(y);
                res.add(row);
            }
        }
        return res;
    }
}
