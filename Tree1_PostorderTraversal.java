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
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        
        post(root);
        return res;
    }
    void post(TreeNode root){
        if(root==null) return;
        post(root.left);
        post(root.right);
        res.add(root.val);
    }
}
