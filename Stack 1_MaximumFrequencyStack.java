public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int n= A.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Stack> stackMap = new HashMap<Integer, Stack>();
        int maxFreq = Integer.MIN_VALUE;
        
        for(int i=0; i<n;i++) {
            int op = A.get(i).get(0);
            int val = A.get(i).get(1);
            if(op == 1){
                //push()
                int freq = freqMap.getOrDefault(val,0);
                freq++;
                freqMap.put(val,freq);

                if(stackMap.containsKey(freq)){
                    stackMap.get(freq).push(val);
                } 
                else {
                    Stack<Integer> st = new Stack<Integer>();
                    st.push(val);
                    stackMap.put(freq, st);
                }

                maxFreq=Math.max(freq, maxFreq);
                res.add(-1);
            } else {
                //pop() the element with Maximum Frequency
                int ans = (int)stackMap.get(maxFreq).pop();
                freqMap.put(ans,freqMap.get(ans)-1);
                if(stackMap.get(maxFreq).isEmpty()) {
                    stackMap.remove(maxFreq);
                    maxFreq--;
                }
                res.add(ans);
            }
        }

        return res;
    }
}
