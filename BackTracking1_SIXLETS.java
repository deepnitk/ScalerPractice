public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> temp = new ArrayList<>();
        return getSubsequenceCount(0,B,A,temp, 0);
    }

    int getSubsequenceCount(int i, int B, ArrayList<Integer> A, ArrayList<Integer> temp, int sum){
        if(i==A.size()){
            if(sum<=1000 && temp.size()==B){
                return 1;
            }
            else return 0;
        }
        // insert
        sum+=A.get(i);
        temp.add(A.get(i));
        int x = getSubsequenceCount(i+1, B, A,temp, sum);

        //discard
        sum-=A.get(i);
        temp.remove(temp.size()-1);
        int y = getSubsequenceCount(i+1, B, A,temp, sum);
        return x+y;
    }
}
