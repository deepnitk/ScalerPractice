public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int i=A.size()-1;i>=0;i--){
            st1.push(A.get(i));
        }

        while(!st1.isEmpty()){
            int x = st1.peek();
            st1.pop();
            while(!st2.isEmpty() && (x<st2.peek())) {
                int temp = st2.peek();
                st1.push(temp);
                st2.pop();
            }
            st2.push(x);
        }

        for(int i=0;i<st2.size();i++)
            res.add(st2.get(i));
        
        return res;
        
    }
}
