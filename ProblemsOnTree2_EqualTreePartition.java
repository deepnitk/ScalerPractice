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

    // to store subTree sum
    HashSet<Long> hs = new HashSet<Long>();
    
    public int solve(TreeNode A) {
        long treeSum = findSum(A);
        if(treeSum%2 != 0) return 0;
        else {
            if(hs.contains(treeSum/2)) return 1;
            else return 0;
        }

    }
    public long findSum(TreeNode A)
    {
        if(A == null) return 0L;
        long left =findSum(A.left);
        long right = findSum(A.right);
        long sum = left+ right+A.val;
        hs.add(sum);
        return left + right+ A.val;
    }
    }
