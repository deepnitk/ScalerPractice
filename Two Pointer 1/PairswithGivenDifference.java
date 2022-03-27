public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int l=0,r=1;
        int count=0;
        int p1 = -1, p2=-1;
        while(r<A.size()){
            int sum = (A.get(r)-A.get(l));
            if(sum==B){
                if(p1!=A.get(r) && p2!=A.get(l)){
                    count++;
                    p1= A.get(r);
                    p2 = A.get(l);
                }
                
                l++;
                r++;
            } else if(sum>B){
                l++;
                if(l==r) r++;
            } else {
                r++;
                
            }
        }
        return count;
    }
}
