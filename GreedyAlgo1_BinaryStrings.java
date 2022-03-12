// T.C: O(N^2) S.C: O(N)

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

// T.C: O(N) S.C: O(N)
public class Solution {
    public int solve(String A, int B) {
        int ans = 0;
        int n = A.length();
        int xr = 0;
        ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(n,0));

        int i =0;
        for(i = 0;i<=n-B;i++){
            xr^=temp.get(i);
            if((A.charAt(i)=='0' && xr == 0) || (A.charAt(i)=='1' && xr == 1)) {
                ans++;
                if(i+B < n) temp.set(i+B,1);
                xr=1-xr;
            }
        }
        while(i<n){
            xr^=temp.get(i);
            int val = A.charAt(i)-'0';
            val^=xr;
            if(val == 0) return -1;
            i++;
        }
        return ans;
    }
}

