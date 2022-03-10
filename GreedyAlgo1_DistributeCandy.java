public class Solution {
    public int candy(ArrayList<Integer> A) {
        ArrayList<Integer> candies = new ArrayList<>(Collections.nCopies(A.size(), 1));
        int res =0;
        for(int i=1;i<A.size();i++){
            if(A.get(i)>A.get(i-1)){
                candies.set(i, candies.get(i-1)+1);
            } 
        }

        for(int i=A.size()-2;i>=0;i--){
            if(A.get(i)>A.get(i+1)){
                candies.set(i,Math.max(candies.get(i), candies.get(i+1)+1));
            }
        }
        for(int candy: candies) res+=candy;

        return res;
    }
}
