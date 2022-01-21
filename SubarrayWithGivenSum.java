public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        prefixSum.add(0);
        for(int i=0;i<A.size();i++){
            prefixSum.add(A.get(i)+prefixSum.get(i));
        }
        int i=0,j=1;
        int count=0;
        boolean found = false;
        while(j<prefixSum.size()){
            int sum= prefixSum.get(j)-prefixSum.get(i);
            if(sum==B){
                found=true;
                break;
            } else if(sum<B) j++;
            else {
                i++;
                if(i==j)
                    j++;
            }
        }
        if(found){
            for(int k=i;k<j;k++){
                res.add(A.get(k));
            }
        }
        else res.add(-1);
        
        return res;
    }
}
