public class Solution {
    public int[][] solve(int[][] A) {
        // initialize n, m and path array
        int N = A.length;
        int M = A[0].length;
        int[][] path = new int[N][M];
        // start with [0,0] position
        traverse(0, 0, A, path, N, M);
        return path;
    }

    public boolean traverse(int i, int j, int[][] A, int[][] path, int n, int m) {

        // base conditions to check if path is found
        if (i + 1 == n && j + 1 == m) {
            // path found
            path[i][j] = A[i][j];
            return true;
        }

        // base conditions where we can't move next
        if (i < 0 || j < 0 || i >= n || j >= m || A[i][j] == 2 || A[i][j] == 0) {
            return false;
        }

        // update path
        path[i][j] = A[i][j];
        // mark as visited
        A[i][j] = 2;

        if (traverse(i + 1, j, A, path, n, m) || traverse(i, j + 1, A, path, n, m)) {
            return true;
        }
        // revert path state as we are backtracking
        path[i][j] = 0;
        // mark as unvisited
        A[i][j] = 1;
        return false;
    }
}
