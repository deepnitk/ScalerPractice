public class Solution {
    public int uniquePaths(int n, int m) {
        if(n==1)
        return countPaths(0,0,n,m);
    }
    
    public static int countPaths(int i,int j, int n, int m){
        if((i==n-1 && j==m-1))
            return 1;
        if(i>=n || j>=m)
            return 0;
        else return countPaths(i+1,j,n,m) +countPaths(i, j+1,n,m);
    }
}
