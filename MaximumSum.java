Given an array of integers A and an integer B. Find and return the maximum value of | s1 - s2 |

where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of elemets of s1

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        long sum =0;
        for(int i=0; i<A.size();i++) sum+=A.get(i);

        long s1=0;
        for(int i=0;i<B;i++) s1+=A.get(i);

        long s2 = sum - s1;
        long ans = Math.abs(s1-s2);

        int i = A.size() - 1;
        s1=0;
        while(B-->0) s1+=A.get(i--);

        s2 = sum - s1;
        return (int) Math.max(ans,Math.abs(s1-s2));
    }
}
