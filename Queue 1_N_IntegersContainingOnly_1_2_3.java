public class Solution {
    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(res.size()<A){
            int temp = q.poll();
            res.add(temp);
            q.add(temp*10+1);
            q.add(temp*10+2);
            q.add(temp*10+3);
        }
        return res;
    }
}
