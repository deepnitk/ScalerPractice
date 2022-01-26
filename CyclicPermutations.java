public class Solution {
    public int solve(String a, String b) {
         b=b+b;
         b = b.substring(0, b.length() - 1);
         String s = a+"$"+b;
         int n = s.length();
         int z[] = new int[n];
         compute_z(s,z);
         int ans=0;
         for(int i=1;i<=s.length()-1;i++){
             if(z[i]==a.length())
                ans++;
         }
         return ans;
    }
  
    // Z algoridthm  
    public static void compute_z(String s, int z[]){
        int l=0, r=0;
        int n = s.length();
        z[0]=n-1;
        for(int i=1;i<=n-1;i++){
            //outside the window
            // 1. Update the Box
            // 2. Apply Brute force way of pattern matching
            if(i>r){
                l=i;
                r=i;
                while(r<n && s.charAt(r - l) == s.charAt(r))
                    r++;
                z[i]=r-l;
                r--;
            }
            //inside the window
            // 1. check if z[k] is within window size
            // 1.1 if yes --> blindly copy
            // 1.2 if no --> again apply BruteForce way of pattern matching from ith idx
            else {
                int k = i - l;
                if (z[k] < r - i + 1) {
                    z[i] = z[k];
                }
                else {
                    l = i;
                    while (r < n && s.charAt(r - l) == s.charAt(r))
                        r++;
                    z[i] = r - l;
                    r--;
                }
            }
        }
    }
}
