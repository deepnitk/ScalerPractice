public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Double> minHeap = new PriorityQueue<Double>();
        HashMap<Double, ArrayList<Integer>> map = new HashMap<>();
        int n = A.size();
        for(int i=0;i<n;i++){
            Double fraction = 1D*A.get(i)/A.get(n-1);
            minHeap.add(fraction);
            map.put(fraction, new ArrayList(Arrays.asList(i, n-1)));
        }

        while(B != 1){
            ArrayList<Integer> temp = map.remove(minHeap.poll());
            if((A.get(1)-1)>A.get(0)){
                Double fraction = 1D*A.get(temp.get(0))/A.get(temp.get(1)-1);
                minHeap.add(fraction);
                map.put(fraction, new ArrayList(Arrays.asList(temp.get(0),temp.get(1)-1)));
            }
            B--;
        }
        ArrayList<Integer> ans = map.get(minHeap.peek());
        return new ArrayList(Arrays.asList(A.get(ans.get(0)), A.get(ans.get(1))));
    }
}
