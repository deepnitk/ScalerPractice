public class Solution {
    public String solve(int A) {
        int count=0;
        // StringBuilder s = new StringBuilder();
        Queue<Long> q = new LinkedList<>();
        q.add(1*1L);
        q.add(2*1L);
        Long temp = 0L;
        while(count<A) {
            temp = q.poll();
            count++;
            q.add(temp*10+1);
            q.add(temp*10+2);
        }
        StringBuilder s = new StringBuilder();
        s.append(Long.toString(temp));
        StringBuilder res = new StringBuilder();
        res.append(s.toString());
        res.append(s.reverse());
        return res.toString();
    }
}
