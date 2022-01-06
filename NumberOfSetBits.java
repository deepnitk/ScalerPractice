public class Solution {
    public int numSetBits(int A) {
        int count=0;
        for(int i=0;i<32;i++){
            if((A&(1<<i))!=0) count++;
        }

        return count;
    }
}
