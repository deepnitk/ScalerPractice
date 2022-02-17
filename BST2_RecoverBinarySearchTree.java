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
    ArrayList<Integer> res = new ArrayList<Integer>();
    TreeNode prev = null, first = null, second=null;
    public ArrayList<Integer> recoverTree(TreeNode A) {
        findSwap(A);
        res.add(second.val);
        res.add(first.val);
        return res;
    }
    public void findSwap(TreeNode root){
        if(root == null) return;
        findSwap(root.left);
        if(prev !=null && prev.val>root.val){
            if(first==null) first=prev;
                second =root;
        }
        prev=root;
        findSwap(root.right);
    }
}
