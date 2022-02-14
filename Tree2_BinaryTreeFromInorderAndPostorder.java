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
    public TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> po) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<in.size();i++){
            hm.put(in.get(i),i);
        }
        return construct(po, 0, po.size()-1, in, 0, in.size()-1, hm);        
    }
    
        public TreeNode construct(ArrayList<Integer> po, int pos, int poe, ArrayList<Integer> in, int ins, int ine, HashMap<Integer, Integer> hm){
        if(pos>poe) return null;
        TreeNode node = new TreeNode(po.get(poe));
        int idx = hm.get(po.get(poe));
        int x = idx - ins;
        node.left = construct(po, pos, pos+x-1, in, ins, idx-1, hm);
        node.right = construct(po, pos+x, poe-1, in, idx+1, ine, hm);
        return node;  
    }
}
