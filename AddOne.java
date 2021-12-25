public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> B = removeZeros(A,n);
        for(int i=B.size()-1; i>=0;i--){
            if(B.get(i)<9) {
                B.set(i, B.get(i)+1);
                return B;
            }
            B.set(i, 0);
        }
        ArrayList<Integer> res = new ArrayList<Integer>(Collections.nCopies(B.size()+1, 0));
        res.set(0,1);
        return res;
    }
    
    public static ArrayList<Integer> removeZeros(ArrayList<Integer> A, int n){
        int idx =-1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)!=0) {
                idx =i;
                break;
            }
        }
        if(idx==-1) return new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>(Collections.nCopies(n-idx,0));
        for(int i=0 ; i< n-idx; i++){
            B.set(i, A.get(idx+i));
        }
        return B;
    }
}
