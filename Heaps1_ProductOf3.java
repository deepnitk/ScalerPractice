public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
       PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
       ArrayList<Integer> res = new ArrayList<Integer>();
       for(int i=0;i<A.size();i++){
           pq.add(A.get(i));
           if(i<2) res.add(-1);
           else {
               int x = pq.poll();
               int y = pq.poll();
               int z = pq.poll();
               res.add(x*y*z);
               pq.add(x);
               pq.add(y);
               pq.add(z);
           }
       }
       return res;
    }
}
