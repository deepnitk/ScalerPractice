public class Solution {
    public int solve(ArrayList<Integer> A) {
        long count = inversionCount(A, 0, A.size()-1);
        return (int)count%1000000007;
    }
    long inversionCount(ArrayList<Integer> A, int l , int r){
        if(l>=r) return 0;

        int mid = (l+r)/2;
        long x = inversionCount(A,l,mid);
        long y = inversionCount(A, mid+1,r);
        long z = merge(A,l, mid+1,r);
        return x+y+z;
    }
    int merge(ArrayList<Integer> A, int l , int m, int r){
        int p1=l,p2=m,p3=0;
        ArrayList<Integer> aux = new ArrayList<Integer>();
        long count =0;

        while(p1<m && p2<=r) {
            if(A.get(p1)<= A.get(p2)){
                aux.add(A.get(p1));
                p1++;
            }
            else {
                aux.add(A.get(p2));
                p2++;
                count+=(m-p1);
            }
        }
        while(p1<m){
            aux.add(A.get(p1));
            p1++;
        }
        while(p2<=r){
            aux.add(A.get(p2));
            p2++;
        }
        for(int i=0;i<r-l+1;i++){
            A.set(l+i, aux.get(i));
        }
        return (int)count%1000000007;
    }
}
