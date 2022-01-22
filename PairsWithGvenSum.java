public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> m = new HashMap<>();
        long count = 0;
        int n= A.size();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(B - A.get(i))) {
                count += m.get(B - A.get(i));
            }
            if(m.containsKey(A.get(i))){
                m.put(A.get(i), m.get(A.get(i))+1);
            }
            else{
                m.put(A.get(i), 1);
            }
        }
        count%=1000000009;
        return (int)count;
    }
}
