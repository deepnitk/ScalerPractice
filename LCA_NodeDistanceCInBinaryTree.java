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
    ArrayList<TreeNode> path = new ArrayList<TreeNode>();
    public ArrayList<Integer> solve(TreeNode A, int B, int C) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        getPath(A, path,B);
        // reversing path[], as we will start traversing from node with val as "B" to "Root"
        Collections.reverse(path);

        res.addAll(getNodes(path.get(0),C));
        C=C-1;

        for(int i=1;i<path.size();i++){
            if(C==0) res.add(path.get(i).val);
            if(path.get(i).left== path.get(i-1)) res.addAll(getNodes(path.get(i).right,C-1));
            else res.addAll(getNodes(path.get(i).left,C-1));
            C=C-1;
        }
        return res;
    }
    
    // This function will populate path from root to node B
    public boolean getPath(TreeNode A, ArrayList<TreeNode> path, int B){
        if(A== null) return false;
        path.add(A);
        if(A.val == B) return true;

        if(getPath(A.left, path, B) || getPath(A.right, path, B)) return true;
        path.remove(path.size()-1);
        return false;
    }
    
    // This function will return list of nodes.val at a distance k from node A
    public ArrayList<Integer> getNodes(TreeNode A, int k){
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        if(A==null) return nodes;
        if(k==0) {
            nodes.add(A.val);
            return nodes;
        }
        ArrayList<Integer> leftNodes = getNodes(A.left, k-1);
        nodes.addAll(leftNodes);
        ArrayList<Integer> rightNodes = getNodes(A.right, k-1);
        nodes.addAll(rightNodes);
        return nodes;
    } 
}
