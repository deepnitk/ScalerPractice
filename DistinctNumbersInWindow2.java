public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> a, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        // Solution
        // int i=0;
        // while(i<A.size()-B+1) {
        //     int c=0;
        //     int j=i;
        //     while(c<B){
        //         if(hm.containsKey(A.get(j)))
        //             hm.put(A.get(j),hm.get(A.get(j)+1));
        //         else
        //             hm.put(A.get(j),1);
        //         j++;
        //         c++;
        //     }
        //     i++;
        //     res.add(hm.size());
        //     hm.clear();
        // }
        
        //Optimised Solution
        if(k>a.size())
            return res;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();   
        int ans = 0;
        for(int i=0;i<k;i++){
            if(freq.containsKey(a.get(i)))
                freq.put(a.get(i), freq.get(a.get(i))+1);
            else{
                freq.put(a.get(i),1);
                ans++;
            }
                
        }
        res.add(ans);
        
        for(int i = k;i<a.size();i++){
            if(freq.containsKey(a.get(i)))
                freq.put(a.get(i), freq.get(a.get(i))+1);
            else{
                freq.put(a.get(i),1);
                ans++;
            }
            if(freq.containsKey(a.get(i-k))){
                freq.put(a.get(i-k), freq.get(a.get(i-k))-1);
            }
            if(freq.get(a.get(i-k))== 0){
                    ans--;
                    freq.remove(a.get(i-k));
                }
                
            res.add(ans);
        }
        return res;
       
    }
}
