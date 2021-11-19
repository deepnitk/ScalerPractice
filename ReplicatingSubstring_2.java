public class Solution {
    public int solve(int A, String B) {
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for(int i=0; i<B.length();i++){
            char c = B.charAt(i);
            if(freqMap.containsKey(c)){
                freqMap.put(c,freqMap.get(c)+1);
            }
            else{
                freqMap.put(c,1);
            }
        }

        Iterator hmIt = freqMap.entrySet().iterator();
        while(hmIt.hasNext()){
            Map.Entry entryElement = (Map.Entry)hmIt.next();
            int freq = (int)entryElement.getValue();
            if(freq%A != 0) return -1;
        }
        return 1;
    }
}
