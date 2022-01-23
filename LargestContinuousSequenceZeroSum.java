public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> pfSum = new ArrayList<Integer>();
        pfSum.add(A.get(0));
        for(int i=1;i<A.size();i++) {
            pfSum.add(A.get(i)+pfSum.get(i-1));
        }

        int ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,-1);
        int start=0,last=0;
        for(int i=0;i<pfSum.size();i++){
            int sum = pfSum.get(i);
            if(hm.get(sum) != null){
                if((i-hm.get(sum))>ans){
                    ans = i-hm.get(sum);
                    start = hm.get(sum);
                    last = i;
                }
            }
            else {
                hm.put(pfSum.get(i), i);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=start+1;i<=last;i++)
            res.add(A.get(i));
        return res;
    }
}
