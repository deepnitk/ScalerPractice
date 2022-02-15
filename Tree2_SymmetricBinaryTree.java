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
        //root is null
        if(A == null)
            return 1;
        // Both left and right are null--return true
        if(A.left == null && A.right == null)
            return 1;
        // if either of left or right is null -- return false
        if(A.left == null || A.right == null)
            return 0;
        // if value of left = right -- return true
        if(A.left.val == A.right.val)
            return 1;

        return (isSymmetric(A.left) == 1 &&
                       isSymmetric(A.right) == 1) ? 1 : 0;

    }
}
