public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
       int res = 0;
       for(int i=0;i<A.size();i++) pq.add(A.get(i));
       
       while(B-- > 0){
           int x = pq.poll();
           x*=-1;
           pq.add(x);
       }
       for(int j:pq){
            res+=j;
        }
       return res;
    }
}
