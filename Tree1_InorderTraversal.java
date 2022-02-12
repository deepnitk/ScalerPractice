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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        TreeNode node;
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        while(root!=null || !st1.isEmpty()){
            if(root!=null){
                st1.push(root);
                root=root.left;
            }
            else {
                root=st1.pop();
                res.add(root.val);
                root=root.right;
            }
        }
        return res;
    }
}
