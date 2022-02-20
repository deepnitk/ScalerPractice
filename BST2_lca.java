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
    static boolean v1 = false, v2 = false;
    public int lca(TreeNode root, int n1, int n2) {
        v1=false;
        v2=false; 
        TreeNode node = helper(root,n1,n2);
        if ((v1 && v2) && node!= null)
            return node.val;
 
        return -1;
    }

    public TreeNode helper(TreeNode root, int n1, int n2){
        if(root == null){
            return null;
        }
        TreeNode temp = null;
        if (root.val == n1)
        {
            v1 = true;
            temp = root;
        }
        if (root.val == n2)
        {
            v2 = true;
            temp = root;
        }
 
        
        TreeNode left = helper(root.left, n1, n2);
        TreeNode right = helper(root.right, n1, n2);

        if (temp != null)
            return temp;

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}
