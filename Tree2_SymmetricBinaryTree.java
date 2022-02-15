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
    boolean isSame = true;
    public int isSymmetric(TreeNode A) {
        if(A == null)
            return 1;
        if(A.left == null && A.right == null)
            return 1;
        if(A.left == null || A.right == null)
            return 0;
        if(A.left.val == A.right.val)
            return 1;

        return (isSymmetric(A.left) == 1 &&
                       isSymmetric(A.right) == 1) ? 1 : 0;

    }
}
