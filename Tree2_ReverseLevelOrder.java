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
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(A==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            res.add(temp);
        }
        int m = res.size();
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<res.get(i).size();j++){
                ans.add(res.get(i).get(j));
            }
        }
        return ans;
    }
}
