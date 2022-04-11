public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int interval = (int)Math.sqrt(n);
        int[] res = new int[interval];
        int max = 0;
        int count = 0, k = 0;

        for(int i=0; i<A.length; i++)
        {
            if(A[i]>max) max = A[i];
            count++;
            if(count == interval)
            {
                res[k++] = max;
                max = 0;
                count = 0;
            }
        }
        return res;
    }
}
