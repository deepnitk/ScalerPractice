Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.
  
public class Solution {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i=0;i< A.size();i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i))+1);
            }
            else{
                map.put(A.get(i),1);
            }
        }
        
        Iterator itr = map.entrySet().iterator();
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            int num = (int)mapElement.getKey();
            int freq = (int)mapElement.getValue();
            while(freq>0){
                result.add(num);
                freq--;
            }
        }
        return result;
    }
}
