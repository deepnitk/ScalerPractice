public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        int i=0;
        while(i<A.size()-B+1) {
            int c=0;
            int j=i;
            while(c<B){
                if(hm.containsKey(A.get(j)))
                    hm.put(A.get(j),hm.get(A.get(j)+1));
                else
                    hm.put(A.get(j),1);
                j++;
                c++;
            }
            i++;
            res.add(hm.size());
            hm.clear();
        }
        return res;
       
    }
}
