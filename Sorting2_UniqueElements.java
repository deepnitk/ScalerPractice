public class Solution {
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int count=0;
        for(int i=1;i<A.size();i++) {
            if(A.get(i)<=A.get(i-1)) {
                count+=A.get(i-1)-A.get(i)+1;
                A.set(i,A.get(i-1)+1);
            }
        }
        return count;
    }
}
