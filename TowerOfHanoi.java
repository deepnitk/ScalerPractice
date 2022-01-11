public class Solution {
    ArrayList<ArrayList<Integer>> res =  new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        towerOfHanoiRec(A,1,3,2);
        return res;
    }

    void towerOfHanoiRec(int n, int from_rod,
                    int to_rod, int aux_rod) 
    { 
        if (n == 0) 
        {
            return; 
        } 
        towerOfHanoiRec(n - 1, from_rod, aux_rod, to_rod); 
        prepareOutput(n, from_rod, to_rod);
        towerOfHanoiRec(n - 1, aux_rod, to_rod, from_rod); 
    }
    void prepareOutput(int n, int from_rod,
                    int to_rod){
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        res1.add(n);
        res1.add(from_rod);
        res1.add(to_rod);
        res.add(res1);
}
 
}
