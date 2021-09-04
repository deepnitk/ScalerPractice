// You are given an array A, consisting of the street numbers of hotels your friend has visited. Every street has just one hotel. Your friend can visit a hotel multiple times too.
// You are supposed to make another array, that stores the indices of the hotels your friend has visited. The array should ignore the multiple visits to each hotel, and should only consider the last visit made to that hotel.
// The array elements should be in order of visiting the hotels.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int i=0; i< A.size();i++){
            if(map.containsKey(A.get(i))){
                map.remove(A.get(i));
                map.put(A.get(i), i);
            }
            else{
                map.put(A.get(i), i);
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            int el = (int)mapElement.getKey();
            result.add(el);
        }
        
        return result;
    }
}
