public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        HashMap<Integer, Integer> hmX = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hmY = new HashMap<Integer, Integer>();

        for(int i=0;i<n;i++){
            if(hmX.containsKey(A.get(i))) hmX.put(A.get(i), hmX.get(A.get(i))+1);
            else hmX.put(A.get(i),1);
            if(hmY.containsKey(B.get(i))) hmY.put(B.get(i), hmY.get(B.get(i))+1);
            else hmY.put(B.get(i),1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int x = A.get(i);
            int y = B.get(i);
            int xCount = 0;
            int yCount = 0;
            if(hmX.containsKey(x)){
               xCount = hmX.get(x);
            }
            if(hmY.containsKey(y)){
                yCount = hmY.get(y);
            }
            count+=(xCount-1)*(yCount-1);
        }
        return count;
    }
}
