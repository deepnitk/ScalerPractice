public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size()-1;
        int l=1, r= A.get(n)-A.get(0);
        int ans =0;
        while(l<=r){
            int mid = (l+r)/2;
            if(check(A, B, mid)){
                ans = mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;

    }
    boolean check(ArrayList<Integer> A, int B, int mid){
        int last_placed = A.get(0);
        int cow=1;
        int n=A.size();
        for(int i=1;i<n;i++){
            if(A.get(i)-last_placed>=mid){
                cow++;
                last_placed=A.get(i);
                if(cow==B) return true;
            }
        }
        return false;
    }
}
