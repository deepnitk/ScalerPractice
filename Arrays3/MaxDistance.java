class Pair{
  int key, value;
    Pair(int x, int y){
       this.key =x;
       this.value = y;
     }
}
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        List <Pair> pairList = new ArrayList();
 
//1. Need to create pairList from input array - key is A[i], value is i
        for (int i=0;i<=A.length-1;i++){
            Pair pair = new Pair(A[i], i);
                pairList.add(pair);
        }

            //2. Sort the collection
            Collections.sort(pairList, (a,b)-> a.key-b.key);

            //3. Collect last pair value - maximum j
            int maxj = pairList.get(pairList.size()-1).value;

            //4. Iterate pairList from RHS to LHS- comparing index value
            int ans =0;
            for (int i = pairList.size()-1;i>=0;i--){
            ans = Math.max(ans, maxj- pairList.get(i).value);
            maxj =Math.max(maxj, pairList.get(i).value);
            }

            return ans;
    }
}
