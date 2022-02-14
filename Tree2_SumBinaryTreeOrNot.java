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
    public boolean isSumTree = true;
    public int solve(TreeNode A) {
        if(A == null){
            return 0;
        }
        sumTree(A);
        return isSumTree ? 1 : 0;
    }

    public int sumTree(TreeNode A){
        if(A.left == null && A.right == null) return A.val;
        int leftSum = A.left != null ? sumTree(A.left) : 0;
        int rightSum = A.right != null ? sumTree(A.right) : 0;
        isSumTree = isSumTree && (A.val == (leftSum+rightSum));
        return leftSum+rightSum+A.val;
    }
}
