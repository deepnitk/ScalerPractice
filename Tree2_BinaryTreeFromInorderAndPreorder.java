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
    public TreeNode buildTree(ArrayList<Integer> pre, ArrayList<Integer> in) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<in.size();i++){
            hm.put(in.get(i),i);
        }
        return construct(pre, 0, pre.size()-1, in, 0, in.size()-1, hm);
    }

    public TreeNode construct(ArrayList<Integer> pre, int ps, int pe, ArrayList<Integer> in, int ins, int ine, HashMap<Integer, Integer> hm){
        if(ps>pe) return null;
        TreeNode node = new TreeNode(pre.get(ps));
        int idx = hm.get(pre.get(ps));
        int x = idx - ins;
        node.left = construct(pre, ps+1, ps+x, in, ins, idx-1, hm);
        node.right = construct(pre, ps+x+1, pe, in, idx+1, ine, hm);
        return node;
        
    }
}
