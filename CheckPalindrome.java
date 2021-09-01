// Given a string A consisting of lowercase characters.
// Check if characters of the given string can be rearranged to form a palindrome.
// Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

public class Solution {
    public int solve(String A) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        if(A.length()==0)
            return 0;
        if(A.length()==1)
            return 1;
        
        for(int i=0;i<=A.length()-1;i++){
            Character c = A.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);
            }
            else{
                freq.put(c,1);
            }
        }
        
        int isPallindrome = 1;
        int oddPallindrome = 1;
        Iterator itr = freq.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            int noOfOcc = (int)mapElement.getValue();
            if(noOfOcc % 2 !=0){
                if(oddPallindrome == 1)
                    oddPallindrome--;
                else{
                    isPallindrome =0;
                    break;
                }
            }
        }
        return isPallindrome ;
    }
}
