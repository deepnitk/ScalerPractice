// Given a string B, find if it is possible to re-order the characters of the string B so that it can be represented as a concatenation of A similar strings.
// Eg: B = aabb and A = 2, then it is possible to re-arrange the string as "abab" which is a concatenation of 2 similar strings "ab".
// If it is possible, return 1, else return -1.

public class Solution {
    public int solve(int A, String B) {
        
        HashMap<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
        for(int idx =0; idx<B.length(); idx++){
            if(charFreqMap.containsKey(B.charAt(idx))){
                charFreqMap.put(B.charAt(idx),charFreqMap.get(B.charAt(idx))+1);
            }
            else{
                charFreqMap.put(B.charAt(idx),1);
            }
        }
        
        boolean flag = true;
        Iterator itr = charFreqMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            int freq = (int)mapElement.getValue();
            if(freq%A != 0)
                flag = false;
            
        }
        return flag? 1:-1;
    }
}
