public class Solution {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        long sum = 0;
        long len = (long)(A.size());
        for(int n :A) {
            min = Math.min(min, n);
            sum += n;
        }
        //AP sum..
        long expected = (len * ((2 * min) + (len - 1)))/2;
        if(expected == sum) return 1;
        return 0;
    }
}
