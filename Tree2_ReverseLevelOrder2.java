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
        ArrayList<Integer> ans = new ArrayList<>();
        if(A==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);

        // Do something like normal level order traversal order. Following are the
        // differences with normal level order traversal
        // 1) Instead of printing a node, we push the node to stack
        // 2) Right subtree is visited before left subtree
        Stack<Integer> st = new Stack<Integer>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                st.push(node.val);
                if(node.right!=null) q.add(node.right);
                if(node.left!=null) q.add(node.left);
                
                
            }
        }

        while (!st.isEmpty())
        {
            ans.add(st.pop());
        }
        return ans;
    }
}
