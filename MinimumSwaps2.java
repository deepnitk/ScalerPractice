public class Solution {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        int n= A.size();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i),i);
        }
        Collections.sort(A);
        
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        for(int i=0;i<n;i++){
            if(visited[i] || map.get(A.get(i))==i)
                continue;
            int j=i,cycle_size=0;
            while(!visited[j]){
                visited[j]=true;
                j=map.get(A.get(j));
                cycle_size++;
            }
            if(cycle_size> 0) count+=(cycle_size-1);
        }
        return count;
    }
}
