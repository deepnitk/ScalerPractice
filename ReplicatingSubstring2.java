public class Solution {
    public int solve(int A, String B) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<B.length();i++){
            char ch = B.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        boolean isPossible = true;
       Iterator hmIterator = hm.entrySet().iterator();
       while (hmIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            int count = (int)mapElement.getValue();
            if(count%A!=0)
            {
                isPossible=false;
                break;
            }
        }
        if(isPossible)
            return 1;
        return -1;
    }
}
