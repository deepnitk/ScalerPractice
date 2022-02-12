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
    int count =0;
    public int solve(TreeNode A) {
        if(A== null) return 0;
        int lc = solve(A.left);
        int rc = solve(A.right);
        return lc+rc+1;
    }
}
