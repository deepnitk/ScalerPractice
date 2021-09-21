// Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.

// Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

// For Example: longest common prefix of "abcdefgh" and "abcefgh" is "abc".

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder pre = new StringBuilder();
        int smallestStringLen = Integer.MAX_VALUE;
        int indexOfSmallestString = 0;
        if(A.size()==1)
            return A.get(0);
        for(int i=0; i<A.size(); i++){
            if(smallestStringLen > A.get(i).length()){
                smallestStringLen = A.get(i).length();
                indexOfSmallestString = i;
            }
        }
        // System.out.println("smallestStringLen "+smallestStringLen);
        // System.out.println("indexOfSmallestString "+indexOfSmallestString);
        
        for(int i =0 ;i<=smallestStringLen -1; i++){
            boolean isQualified = true;
            for(int j=0; j<=A.size()-1; j++){
                if(A.get(indexOfSmallestString).charAt(i) != A.get(j).charAt(i)){
                    isQualified = false;
                    break;
                }
            }
            if(isQualified){
            // System.out.println("A.get(indexOfSmallestString).charAt(i) "
            //     +A.get(indexOfSmallestString).charAt(i));
            pre.append(A.get(indexOfSmallestString).charAt(i));
            }
            else
                return pre.toString();

        }
        return pre.toString();
    }
}
