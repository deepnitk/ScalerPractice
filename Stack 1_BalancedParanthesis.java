public class Solution {
    public int solve(String A) {
        int n = A.length();
        Stack<Character> st = new Stack<Character>(); 
        if(n%2 != 0)
            return 0;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch== '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return 0;
                } else {
                    char temp = (char)st.peek();
                    if(temp == '{' && ch == '}') st.pop();
                    else if(temp == '[' && ch == ']') st.pop();
                    else if(temp == '(' && ch == ')') st.pop();
                    else return 0;
                }
                
            }
        }
         return st.size() == 0 ? 1 : 0;
    }
}
