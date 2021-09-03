// Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].
// He wants to select some trees to replace his broken branches.
// But he wants uniformity in his selection of trees.
// So he picks only those trees whose heights have frequency K.
// He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).
// But the sum he ended up getting was huge so he prints it modulo 10^9+7.
// In case no such cluster exists, Groot becomes sad and prints -1

public class Solution {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        int sum=0;
        C.forEach((c)->{
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            }
            else{
                frequency.put(c,1);
            }
        });
        
        Iterator itr = frequency.entrySet().iterator();
        boolean flag = false;
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            int freq = (int)mapElement.getValue();
            if(freq==B){
                sum=sum+(int)mapElement.getKey();
                flag=true;
                
            }
        }
        int factor = (int)Math.pow(10,9)+7;
        return flag?(sum%(factor)):-1;
    }
}
