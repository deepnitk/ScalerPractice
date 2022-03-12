public class Solution {
    public int solve(String A, int B) {
        int ans = 0;
        int n = A.length();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(A.charAt(i) - '0');

        for(int i = 0;i<=n-B;i++){
            if(arr.get(i)==0){
                ans+=1;
                for(int j=0;j<B;j++){
                    arr.set(i+j,arr.get(i+j)^1);
                }
            }
        }
        for(int i=n-B+1;i<n;i++){
            if(arr.get(i) == 0) return -1;
        }
        return ans;
    }
}

// T.C: O(N^2) S.C: O(N)
