public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        // we need to identify 2 dips
        int n= A.size();
        ArrayList<Integer> original = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            original.add(A.get(i));
        }
        Collections.sort(A);
        int i=0,j=0;
        while (i < n && j < n) {
            if (A.get(i) != original.get(j)) {
                res.add(i);
            }
            i++;
            j++;
        }
        if (res.size() > 0) {
            return new ArrayList(Arrays.asList(res.get(0), res.get(res.size() - 1)));
        }
        return new ArrayList(Arrays.asList(-1));
    }
}
