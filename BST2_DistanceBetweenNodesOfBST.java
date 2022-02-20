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
    public int solve(TreeNode A, int B, int C) {
        if (B > C){
            int temp = B;
            B = C;
            C = temp;
        }
        return distanceBetween2(A,B,C);
    }

    public int distanceBetween2(TreeNode A, int B, int C){
        if(A== null) return 0;
        if(A.val>B && A.val>C) return distanceBetween2(A.left, B,C);
        else if(A.val<B && A.val <C) return distanceBetween2(A.right, B, C);
        if (A.val >= B && A.val <= C) return (distanceFromRoot(A, B) + distanceFromRoot(A, C));
        return -1 ;
    }

    public int distanceFromRoot(TreeNode root, int x)
    {
        if (root.val == x)
        return 0;
        else if (root.val > x)
        return 1 + distanceFromRoot(root.left, x);
        return 1 + distanceFromRoot(root.right, x);
    }

}
