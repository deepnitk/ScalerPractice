public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int K) {
        int N = A.length;
        // initialize search space
        int l = 0;
        int r = N - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (A[mid] == K) {
                // found the answer
                return mid;
            } else if (A[0] < A[mid]) {
                // we are in left subArray now
                // now check if K lies within A[0] to A[mid]
                if (A[0] <= K && K < A[mid]) {
                    // if K lies within range A[0] to A[mid], ignore right part of mid
                    r = mid - 1;
                } else {
                    // ignore left part of mid
                    l = mid + 1;
                }
            } else {
                // we are in right subArray now
                // now check if K lies within A[mid] to A[N-1]
                if (A[mid] < K && K <= A[N - 1]) {
                    // if K lies within range A[mid] to A[N-1], ignore left part of mid
                    l = mid + 1;
                } else {
                    // ignore right part of mid
                    r = mid - 1;
                }
            }
        }

        // if K is not found, return -1
        return -1;
    }
}
