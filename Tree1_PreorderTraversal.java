/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(A == null) return res;
        stack.push(A);
        while(!stack.isEmpty()){
            A = stack.pop();
            res.add(A.val);
            if(A.right!=null) stack.push(A.right);
            if(A.left!=null) stack.push(A.left);
        }
        return res;
    }
}
