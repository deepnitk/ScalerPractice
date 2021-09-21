#using dp Table

public class Solution {
    public int uniquePaths(int n, int m) {
        if(m==1)
            return 1;
        int dpTable[][] = new int[n][m];
    

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                dpTable[i][j] = -1;
            }
        }
        return countPaths(0,0,n,m, dpTable);
    }
    
    public static int countPaths(int i,int j, int n, int m, int dpTable[][]){
        if((i==n-1 && j==m-1)) return 1;
        if(i>=n || j>=m) return 0;
        
        if(dpTable[i][j] != -1) return dpTable[i][j];
        else return dpTable[i][j] = countPaths(i+1,j,n,m, dpTable) + countPaths(i, j+1,n,m, dpTable);
    }
}
