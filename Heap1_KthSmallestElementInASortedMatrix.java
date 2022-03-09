public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                int ele = A.get(i).get(j);
                if(maxHeap.size()<B){
                    maxHeap.add(ele);
                } else {
                    if(maxHeap.peek()>ele){
                        maxHeap.remove();
                        maxHeap.add(ele);
                    }
                }
            }
        }
        if(maxHeap.size()>0) return maxHeap.poll();
        return 0;
    }
}
