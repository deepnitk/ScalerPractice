#Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.
  public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> firstMap = new HashMap<Integer, Integer>(A.size()-1);
        if(A.size()==0 || B.size() ==0)
            return new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(int i=0;i<= A.size()-1;i++){
            if(firstMap.containsKey(A.get(i))){
                firstMap.put(A.get(i),firstMap.get(A.get(i))+1);
            }
            else
                firstMap.put(A.get(i),1);
        }
        for(int i=0;i <= B.size()-1;i++){
            if(firstMap.containsKey(B.get(i)) && firstMap.get(B.get(i)) > 0){
                intersection.add(B.get(i));
                int freq = firstMap.get(B.get(i));
                freq--;
                firstMap.put(B.get(i), freq);
            }
            
        }
        return intersection;
    }
}
