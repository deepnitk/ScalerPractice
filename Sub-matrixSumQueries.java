public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
        int n=A.size();
        int m=A.get(0).size();
        int q,a1,a2,b1,b2,p;
        long sum;
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<ArrayList<Long>> pf = new ArrayList<ArrayList<Long>>();
        Collections.nCopies(n, new ArrayList(Collections.nCopies(m, 0L))).forEach((pf1) -> pf.add(new ArrayList(pf1)));
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0) pf.get(i).set(j, (long)A.get(i).get(j));
                else pf.get(i).set(j, pf.get(i).get(j-1)+A.get(i).get(j));
            }
        }

        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                pf.get(i).set(j,pf.get(i-1).get(j)+pf.get(i).get(j));
            }
        }

        q=B.size();
        p=0;
        while(q>0){
            sum=0;
            a1=B.get(p)-1;
            b1=C.get(p)-1;
            a2=D.get(p)-1;
            b2=E.get(p)-1;
            sum=(pf.get(a2).get(b2));
            if(a1>0) sum -= pf.get(a1-1).get(b2);
            if(b1>0) sum -= pf.get(a2).get(b1-1);
            if(a1>0 && b1>0) sum += pf.get(a1-1).get(b1-1);
            sum= sum%1000000007;
            if(sum<0)
                sum+=1000000007;
            res.add((int)sum);
            p++;
            q--;
        }

        return res;

    }
}
