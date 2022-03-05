public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        PriorityQueue<ArrayList<Integer>> queue = new PriorityQueue<>
        (Comparator.comparing((ArrayList<Integer> a) -> (long)a.get(0) * (long)a.get(0) + (long)a.get(1) * (long)a.get(1)));
        for (ArrayList<Integer> i : A) {
            queue.add(i);
        }
        int k = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while (!queue.isEmpty() && k < B) {
            res.add(queue.poll());
            k++;
        }
        return res;
    }
}
