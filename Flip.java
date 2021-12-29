public class Solution {
    public int[] flip(String str) {
        if (str.length() == 0)
        return new int[]{};   
    boolean zero = false;
    int gain[] = new int[str.length()];
    for (int i = 0; i< str.length(); i++) {          
           gain[i] = (str.charAt(i) == '1') ? -1 : 1;
       if (str.charAt(i) == '0') {
               zero = true; 
           }
    }
    if(!zero)
        return new int[]{};   
    int l = 0;
    int r = str.length() - 1;
    int maxSum = 0;
    int curSum = 0;
    int currL = 0;
    int currR = 0;
    for (int i =  0; i < gain.length; i++) {
        if (curSum + gain[i] >= 0) {
            curSum += gain[i];
            currR = i;
        }
        else {
            curSum = 0; 
            currL = i + 1;
        }
        if (curSum > maxSum) {
            maxSum = curSum; 
            l = currL;
            r = currR;
        }         
    }
    return new int[]{l + 1, r + 1};
    }
}
