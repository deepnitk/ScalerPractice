import java.util.Map.Entry;
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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(A==null) return res;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();

        Queue<Map<TreeNode, Integer>> q = new LinkedList<Map<TreeNode, Integer>>();
        q.add(prepareQueueEntry(A, 0));
        q.add(null);
        while(q.size()>1){
            Map<TreeNode, Integer> node = q.peek();
            if(node!=null){
                //Get your node and level
                Entry<TreeNode, Integer> currentEntry = node.entrySet().iterator().next();
                TreeNode tempNode = currentEntry.getKey();
                Integer level = currentEntry.getValue();
                min = Math.min(min,level);
                max = Math.max(max, level);

                //Insert the node in HM
                if(hm.containsKey(level)){
                    ArrayList<Integer> list = hm.get(level);
                    list.add(tempNode.val);
                    hm.put(level, list);
                } else {
                    ArrayList<Integer> firstNodeOfLevel = new ArrayList<Integer>();
                    firstNodeOfLevel.add(tempNode.val);
                    hm.put(level, firstNodeOfLevel);
                }

                //Put left node in Queue with level-1
                if(tempNode.left!=null){
                    q.add(prepareQueueEntry(tempNode.left, level-1));
                }
                //Put left node in Queue with level+1
                if(tempNode.right!=null){
                    q.add(prepareQueueEntry(tempNode.right, level+1));
                }
                
            } else {
                q.add(null);
            }
            q.poll();
        }

        //Get the list from Hm
        for(int i= min;i<=max;i++){
            res.add(hm.get(i));
        }

        return res;
    }

    private static Map<TreeNode, Integer> prepareQueueEntry(TreeNode root, int level) {
        Map<TreeNode, Integer> queueEntry = new HashMap<TreeNode, Integer>();
        queueEntry.put(root, level);
        return queueEntry;
    }
}
