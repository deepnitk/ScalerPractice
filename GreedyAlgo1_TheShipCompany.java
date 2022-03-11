public class Solution {
    public ArrayList<Integer> solve(int A, int B, ArrayList<Integer> C) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<C.size();i++){
            maxHeap.add(C.get(i));
            minHeap.add(C.get(i));
        }
        int max =0, min =0;
        while(A-- > 0){
            int x = maxHeap.poll();
            maxHeap.add(x-1);
            max+=x;
            int y = minHeap.poll();
            if(y-1>0)
                minHeap.add(y-1);
            min+=y;            
        }
        return new ArrayList(Arrays.asList(max, min));
        
    }
}
