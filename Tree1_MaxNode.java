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
    public int solve(TreeNode A) {
        return getMax(A);
    }

    public int  getMax(TreeNode A){
        if(A==null) return 0;
        int leftMax= getMax(A.left);
        int rightMax = getMax(A.right);
        int ans = A.val;
        return Math.max(ans, Math.max(leftMax, rightMax));

    }
}
