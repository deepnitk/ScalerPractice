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
    int height =0;
    public int solve(TreeNode A) {
        calHeight(A);
        return height;
    }

    public int calHeight(TreeNode root){
        if(root== null) return 0;
        
        height = Math.max(calHeight(root.left), calHeight(root.right)) + 1;
        return height;
    }
}
