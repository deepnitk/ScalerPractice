public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st = new Stack<Integer>();
        // Stack<String> stOp = new Stack<String>();
        for(int i=0;i<A.size();i++){
            String temp = A.get(i);
            if("+".equals(temp) || "-".equals(temp) || "*".equals(temp)|| "/".equals(temp))
            {
                int val1 = st.pop();
                int val2 = st.pop();
                switch(temp){
                    case "+": int sum = val1+val2;
                              st.push(sum);
                              break;
                    case "-": int diff = val2-val1;
                              st.push(diff);
                              break;
                    case "*": int mul = val1*val2;
                              st.push(mul);
                              break;
                    case "/": int div = val2/val1;
                              st.push(div);
                              break;
                }
            }
            else
                st.push(Integer.parseInt(A.get(i)));

        }
        return st.pop();
    }
}
