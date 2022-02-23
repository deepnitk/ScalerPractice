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
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(A);
        boolean isOdd = true;
        int oddSum =0, evenSum =0;
        while(!q.isEmpty()){
            int n= q.size();
            ArrayList<Integer>  level= new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                if(isOdd) oddSum+=q.poll().val;
                else evenSum+=q.poll().val;
            }
            isOdd=!isOdd;
        }
        return oddSum-evenSum;
    }
}
