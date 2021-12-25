public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int diff;
        int max_sub = Integer.MIN_VALUE;
        int min_sub = Integer.MAX_VALUE;
        int max_add = Integer.MIN_VALUE;
        int min_add = Integer.MAX_VALUE;

        for(int i= 0; i<A.size(); i++){
            min_sub = Math.min(min_sub, A.get(i)-i);
            max_sub = Math.max(max_sub, A.get(i)-i);
        }
        diff = max_sub-min_sub;
         for(int i= 0; i<A.size(); i++){
            min_add = Math.min(min_add, A.get(i)+i);
            max_add = Math.max(max_add, A.get(i)+i);
        }
        diff = Math.max(diff, max_add-min_add);
        return diff;
    }
}
