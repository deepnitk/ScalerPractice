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
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(!isLeaf(A)) res.add(A.val);
        addLeftBoundary(A, res);
        addLeaves(A, res);
        addRightBoundary(A,res);
        return res;
    }

    public void addLeftBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode node = root.left;
        while(node!=null){
            if(!isLeaf(node)) res.add(node.val);
            if(node.left != null) node= node.left;
            else node = node.right;
        }
    }

    public void addLeaves(TreeNode root, ArrayList<Integer> res){
        if(isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if(root.left!=null) addLeaves(root.left, res);
        if(root.right!=null) addLeaves(root.right, res);
    }

    public void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode node = root.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(node!=null){
            if(!isLeaf(node)) temp.add(node.val);
            if(node.right != null) node= node.right;
            else node = node.left;
        }

        Collections.reverse(temp);
        res.addAll(temp);
    }

    public boolean isLeaf(TreeNode root){
        return (root.left == null) && (root.right == null);
    }
}
