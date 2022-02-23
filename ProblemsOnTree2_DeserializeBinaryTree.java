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
    public TreeNode solve(ArrayList<Integer> A) {
        if(A.size()<1) return null;
        TreeNode root = new TreeNode(A.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int n=0;
        while(!q.isEmpty() && n<A.size()){
            TreeNode curr = q.poll();
            if(A.get(n+1)!=-1) {
                TreeNode left = new TreeNode(A.get(n+1));
                q.add(left);
                curr.left = left;
            }   
            else curr.left = null;
           if(A.get(n+2)!=-1) {
                TreeNode right = new TreeNode(A.get(n+2));
                q.add(right);
                curr.right = right;
            }   
            else curr.right = null;
            n+=2;
        }
        return root;
    }

}
