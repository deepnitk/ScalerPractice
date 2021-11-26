public class Solution {
    public int solve(int A, int B, int C) {
        int i;
        int j;
        i=A/C;
        j=B/C;
        if(i*C!=A) i++;
        if(j*C!=B) j++;
        return i*j;
    }
}
