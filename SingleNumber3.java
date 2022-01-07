public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int xor=0,xor1=0,xor2=0;
        for(int i=0;i<A.size();i++) xor^=A.get(i);
        xor = xor & -(xor-1);
        for(int i=0;i<A.size();i++){
            if((A.get(i)&xor)!=0) xor1^=A.get(i);
            else xor2^=A.get(i);
        }
        res.add(xor1);
        res.add(xor2);
        Collections.sort(res);
        return res;
    }
    public static int findFirstSetBitPos(int a){
        int pos =-1;
        for(int i=0;i<32;i++){
            if((a&(1<<i))!=0)
                pos=i;
                break;
        }
        return pos;
    }
}
