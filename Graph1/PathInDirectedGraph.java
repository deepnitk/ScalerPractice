public class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    int ans = 0;

    public int solve(int A, int[][] B) {
        populateAdjacencyList(A, B);
        find(1,A);
        return ans;
    }

    private void populateAdjacencyList(int A, int[][] B){
        for(int i=1;i<=A;i++)
            map.put(i,new ArrayList<>());
        for(int i=0;i<B.length;i++)
            map.get(B[i][0]).add(B[i][1]);
    }

    private void find(int src, int end){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int current = q.remove();
            visited.add(current);
            List<Integer> children = map.get(current);
            for(Integer child: children){
                if(child == end){
                    ans = 1;
                    return;
                }
                if(!visited.contains(child))
                    q.add(child);
            }
        }
    }
}
