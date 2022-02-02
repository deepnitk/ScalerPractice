public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> resMatrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> innerArray = new ArrayList<>();
        int noOfRows = 0;
        for(int i=0;i< B.size(); i++) {
            ArrayList<Integer> rotatedArray = leftRotate(A, A.size(), B.get(i));
            resMatrix.add(noOfRows, rotatedArray);
            noOfRows++;
        }
        return resMatrix;
    }
    
    public static ArrayList<Integer> leftRotate(ArrayList<Integer> A, int n, int k){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = k; i < k + n; i++) {
            temp.add(A.get(i%n));
        }
        return temp;
    }
}
