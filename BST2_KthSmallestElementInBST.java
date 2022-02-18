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
    public int kthsmallest(TreeNode A, int B) {
        while (A!=null) {
            //get the values from precomputed map
            int lstsize = getNodeCount(A.left) +1;
            if (lstsize == B ) return A.val;
            else if ( lstsize> B) A = A.left;
            else {
                // we need to reduce count of values which we have already covered till that node on LHS
                B= B-lstsize;
                A= A.right;
            }
        }
        return -1;
    }

    //Global Variable
    Map<TreeNode, Integer> countMap = new HashMap();

    // Precompute node count for everynode first
    public int getNodeCount(TreeNode A){
        if ( A==null) return 0;
        if ( countMap.containsKey(A)){
        return countMap.get(A);
        }
        int nodeCount = getNodeCount(A.left)+ getNodeCount(A.right) +1;
        countMap.put(A, nodeCount);
        return nodeCount;
    }
}
