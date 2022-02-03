public class Solution {
    public int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(B);
        for(int i=0;i<C.size();i++){
            if(C.get(i)==0) st.pop();
            else st.push(C.get(i));
        }
        return st.peek();
    }
}
