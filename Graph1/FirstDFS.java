public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(int[] A, final int B, final int C) {
        ArrayList <ArrayList <Integer>> graph = new ArrayList <> ();
        for (int i = 0 ; i <= A.length ; i++) {
            graph.add(new ArrayList <> ());
        }
    
        for (int i = 0 ; i < A.length ; i++) {
            graph.get(A[i]).add (i + 1);
        }
        return dfs (graph , B , C);
    }

    private int dfs(ArrayList <ArrayList <Integer>> graph, int B, int C){
        Stack<Integer> stack=new Stack<>();
        stack.push(C);
        while(!stack.isEmpty()){
        int node=stack.pop();
        if(node==B) return 1;
        for(Integer child:graph.get(node)){
        stack.push(child);
        }
        }
        return 0;
    }    
}
