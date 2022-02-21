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
    int diameter = 0;
    public int solve(TreeNode A) {
        getDiameter(A);
        return diameter;
    }

    public int getDiameter(TreeNode root){
        if(root==null) return -1;
        int left = getDiameter(root.left);
        int right = getDiameter(root.right);
        diameter = Math.max(left+right+2, diameter);
        return Math.max(left, right) + 1;
    }
}
