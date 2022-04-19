public class Solution {

    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int islandsCount = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==1){
                    islandsCount++;
                    markNeighboursVisited(A, i, j, n, m);
                }
            }
        }
        return islandsCount;
    }

    private void markNeighboursVisited(int[][] A, int i, int j, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || A[i][j]    != 1) return;
        A[i][j]=-1;
        markNeighboursVisited(A,i-1,j,n,m);
        markNeighboursVisited(A,i,j-1,n,m);
        markNeighboursVisited(A,i+1,j,n,m);
        markNeighboursVisited(A,i,j+1,n,m);
        markNeighboursVisited(A,i-1,j-1,n,m);
        markNeighboursVisited(A,i+1,j+1,n,m);
        markNeighboursVisited(A,i-1,j+1,n,m);
        markNeighboursVisited(A,i+1,j-1,n,m);
    }
}
