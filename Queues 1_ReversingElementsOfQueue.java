public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        // create queue with input A
        for(int i=0;i<A.size();i++){
            q.add(A.get(i));
        }

        if(q.isEmpty() || B> q.size())
            return res;
        if(B<=0)
            return A;
        // Create auxillary stack and put first B elements into the stack...
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<B;i++) {
            st.add(q.poll());

        }
      
        //enque back by poping element from stack...
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
      
        //for size-B elements pop and add at back of the queue..
        int c = 0;
        while(c<q.size()-B){
            int temp = q.poll();
            q.add(temp);
            c++;
        }
        
        while(q.size()>0){
            res.add(q.poll());
        }

        return res;
    }

}
