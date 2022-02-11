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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        TreeNode node;
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        if(root == null)
            return null;
        st1.push(root);
        while(!st1.isEmpty()){
            node = st1.pop();
            st2.push(node);
            if(node.left!=null)
                st1.push(node.left);
            if(node.right!=null)
                st1.push(node.right);
        }

        while(!st2.isEmpty()){
            node = st2.pop();
            res.add(node.val);
        }

        return res;
    }
}
