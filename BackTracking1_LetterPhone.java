public class Solution {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> letterCombinations(String A) {
        HashMap<Character, String> digitLetters = new HashMap<>();
        digitLetters.put('0',"0");
        digitLetters.put('1',"1");
        digitLetters.put('2',"abc");
        digitLetters.put('3',"def");
        digitLetters.put('4',"ghi");
        digitLetters.put('5',"jkl");
        digitLetters.put('6',"mno");
        digitLetters.put('7',"pqrs");
        digitLetters.put('8',"tuv");
        digitLetters.put('9',"wxyz");
        StringBuilder s = new StringBuilder();
        getLetterPhone(A,0, A.length(),s, digitLetters);
        return res;
    }
    public void getLetterPhone(String A, int i, int n, StringBuilder s, HashMap<Character, String> digitLetters){
        if(i==n){
            res.add(s.toString());
            return;
        }
        String letters = digitLetters.get(A.charAt(i));
        for(int k=0;k<letters.length();k++){
            s.append(letters.charAt(k));
            getLetterPhone(A, i+1, n, s, digitLetters);
            s.deleteCharAt(s.length()-1);
        }
    }
}
