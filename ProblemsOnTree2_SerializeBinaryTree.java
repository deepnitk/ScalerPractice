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
    public ArrayList<Integer> solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        q.add(A);
        while(!q.isEmpty()){
                TreeNode temp = q.poll();
                if(temp== null) res.add(-1);
                else {
                    res.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
        }
        return res;
    }
}
