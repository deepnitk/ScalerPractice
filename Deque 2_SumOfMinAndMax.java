public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        long sum =0;
        long mod = 1000000007;
        ArrayList<Integer> minArray = new ArrayList<Integer>();
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        minArray = slidingMin(A,B);
        maxArray = slidingMax(A,B);

      for(int i=0;i<minArray.size();i++){
            long temp=(minArray.get(i)+maxArray.get(i))%mod;
            sum=(sum+temp)%mod;
            sum%=mod;
        }
       return (int)((sum+mod)%mod);
    }

    public ArrayList<Integer> slidingMax(ArrayList<Integer> A, int B){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            while(dq.size()>0 && A.get(i)>=A.get(dq.getLast())){
                dq.removeLast();
            }
            dq.add(i);

            if( i == A.size()-1){
                ArrayList<Integer> ans1 = new ArrayList<Integer>();
                ans1.add(A.get(dq.getFirst()));
                return ans1;
            }
        }
        ans.add(A.get(dq.getFirst()));
        
        for(int i=B;i<A.size();i++){
            if(i-B == dq.getFirst()) dq.removeFirst();
            while(dq.size()>0 && A.get(i)>=A.get(dq.getLast())){
                dq.removeLast();
            }
            dq.add(i);
            ans.add(A.get(dq.getFirst()));
        }

        return ans;
    }

    public ArrayList<Integer> slidingMin(ArrayList<Integer> A, int B){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            while(dq.size()>0 && A.get(i)<A.get(dq.getLast())){
                dq.removeLast();
            }
            dq.add(i);

            if( i == A.size()-1){
                ArrayList<Integer> ans1 = new ArrayList<Integer>();
                ans1.add(A.get(dq.getFirst()));
                return ans1;
            }
        }
        ans.add(A.get(dq.getFirst()));
        
        for(int i=B;i<A.size();i++){
            if(i-B == dq.getFirst()) dq.removeFirst();
            while(dq.size()>0 && A.get(i)<A.get(dq.getLast())){
                dq.removeLast();
            }
            dq.add(i);
            ans.add(A.get(dq.getFirst()));
        }

        return ans;
        
    }
}
