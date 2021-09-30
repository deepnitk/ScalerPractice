// You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

// Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

// NOTE: if B > N, return an empty array.

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> a, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        
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
