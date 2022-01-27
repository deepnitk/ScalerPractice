public class Solution {
    public int lengthOfLongestSubstring(String A) {
        int l=0,r=0;
        int n= A.length();
        int ans = Integer.MIN_VALUE;
        HashSet<Character> hs = new HashSet<Character>();
        while(r<n){
            if (!hs.contains(A.charAt(r))){
                    hs.add(A.charAt(r));
                    r++;
                    ans = Math.max(ans, hs.size());
                } else {
                    hs.remove(A.charAt(l));
                    l++;
                }
        }
        return ans;
    }

}
