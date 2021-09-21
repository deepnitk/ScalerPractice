#Solution using combination
n+m-2  C (n-1 or m-1)
  
public class Solution {
    public int uniquePaths(int n, int m) {
        int N = n+m-2;
        int r = Math.min(m-1, n-1);
        double res = 1;
        for(int i=1;i<=r;i++)
            res = res*(N-r+i)/i;
        return (int)res;
    }
}
