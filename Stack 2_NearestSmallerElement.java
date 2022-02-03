public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i< A.size();i++){
            while(!stack.isEmpty() && stack.peek()>=A.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()) res.add(-1);
            else res.add(stack.peek());

            stack.push(A.get(i));
        }
        return res;
    }
}
