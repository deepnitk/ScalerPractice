// Given a string A of size N.

// Return the string A after reversing the string word by word.

// NOTE:

// A sequence of non-space characters constitutes a word.
// Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
// If there are multiple spaces between words, reduce them to a single space in the reversed string.


public class Solution {
    public String solve(String A) {
        
        StringBuilder output = new StringBuilder();
        String[] words = A.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            output.append(" ");
        }
    
        return output.toString().trim();
        
        // StringBuilder str = new StringBuilder();
        // str.append(A);
        // str.reverse();
        // int l=0;
        // int r =0;
        // while((l<=r)&& r<=str.toString().length()){
        //     if(str.charAt(r)==""){
        //         temp=r;
        //         r--;
        //         reverse(str, l,r);
        //         l=temp+1;
        //         r=temp+1;
        //     }
        //     else{
        //         r++;
        //     }
            
        // }
    }
    // public static void reverseSubString(StringBuilder str, int start, int end){
    //     String rev="";  
    //     for(int i=ch.length-1;i>=0;i--){  
    //         rev+=ch[i];  
    //     }  
    //     return rev;  
    // }
}
