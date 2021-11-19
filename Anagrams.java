// TC: O(nk) n: no of strings k: len of longest string
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    HashMap<ArrayList<Integer>,ArrayList<Integer>> groupFreq = new HashMap<ArrayList<Integer>,ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
        for(int i=0;i<A.size();i++){
            String s = A.get(i);
            groupString(s,i);
        }
        
        Iterator it = groupFreq.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry mapElement =(Map.Entry)it.next();
            ArrayList<Integer> group = (ArrayList<Integer>)mapElement.getValue();
            res.add(group);
        }

        return res;
    }
    public void groupString(String s , int pos){
        ArrayList<Integer> freq = new ArrayList<Integer>(Collections.nCopies(26, 0));
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq.set(c-'a', freq.get(c-'a')+1);
        }
        if(groupFreq.containsKey(freq)){
            groupFreq.get(freq).add(pos+1); 
        }
        else{
            ArrayList<Integer> groups = new ArrayList<Integer>();
            groups.add(pos+1);
            groupFreq.put(freq,groups);
        }
        return;
    }
}
