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
    int pathSum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
        getMaxPath(A);
        return pathSum;
    }

    public int getMaxPath(TreeNode root){
        if(root==null) return 0;
        // Doing Max(0, maxPath) -> we are ignoring negative path Sum
        int left = Math.max(0,getMaxPath(root.left)) ;
        int right = Math.max(0, getMaxPath(root.right));
        pathSum = Math.max(left+right+root.val, pathSum);
        return Math.max(left, right) + root.val;
    }
}
