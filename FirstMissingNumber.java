public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        for(int i=0; i<A.size();i++){
            if(A.get(i)<1 || A.get(i)> n) continue;
            else {
                int rightPos = A.get(i)-1;
                if(A.get(rightPos)!=A.get(i)){
                    swap(A, i, rightPos);
                    i--;
                }
            }
        }
        for(int i=0; i<A.size();i++){
            if(i+1 != A.get(i)) return i+1;
        }
        return n+1;
    }
    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }
}
