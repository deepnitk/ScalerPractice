// Given a string A of size N consisting of lowercase alphabets.

// You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

// Find the minimum number of distinct characters in the resulting string.

public class Solution {
    public int solve(String A, int B) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        
        for(int i=0;i<=A.length()-1;i++){
            Character c = A.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);
            }
            else{
                freq.put(c,1);
            }
        }
        while(B>=0){
            Character charWithMaxValue = freq.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
            // System.out.println("charWithMaxValue "+charWithMaxValue);
            Character charWithMinValue = freq.entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
            // System.out.println("charWithMinValue "+charWithMinValue);
            if(freq.get(charWithMinValue)<= B){
                B-= freq.get(charWithMinValue);
                // System.out.println("B after minus "+B);
                freq.put(charWithMaxValue, freq.get(charWithMaxValue)+ freq.get(charWithMinValue));
                freq.remove(charWithMinValue);
            }
            else
                break;
        }
        return freq.size();
    }
}
