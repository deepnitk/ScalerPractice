public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Deque<Integer> dq = new LinkedList<Integer>();
        //prepare first window
        for(int i=0;i<B;i++){
            while(dq.size()>0 && dq.getLast()<A.get(i))
                dq.removeLast();
            dq.addLast(A.get(i));
        }
        ans.add(dq.getFirst());
        // start sliding
        for(int i=B;i<A.size();i++){
            while(dq.size()>0 && dq.getLast()<A.get(i))
                dq.removeLast();
            dq.addLast(A.get(i));
            if(dq.getFirst() == A.get(i-B))
                dq.removeFirst();
            ans.add(dq.getFirst());
        }
        return ans;
    }
}
