public class Solution {
    public String solve(String A) {
        StringBuilder res = new StringBuilder();
        // String res = "";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else{
                char temp = st.peek();
                if(temp == ch) st.pop();
                else st.push(ch);
            }
        }
        if(st.isEmpty()) return res.toString();
        else {
            while(!st.isEmpty()){
                res.append((char)st.peek());
                st.pop();
            }
        }
        res.reverse();
        return res.toString();
    }

}
