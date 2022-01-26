public class Solution {
    public int solve(String s) {
        int n=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') n++;
        }
        ans= (n*(n+1))/2;
        return ans;
    }
    
}
