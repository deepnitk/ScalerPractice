public class Solution {
  /*Modified Kadane's Algo*/
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum =0, max_sum = 0;
        int start=0, end=0, aStart =-1, aEnd =-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)>=0){
                sum+=A.get(i);
                if(sum>max_sum ||(sum==max_sum && (aEnd-aStart)<(end-start))){
                    max_sum = sum;
                    aStart= start;
                    aEnd = end;
                }
            }
            else {
                sum =0;
                start = i+1;
            }
            end++;
        }

        if(aStart==-1) return res;
        for(int i=aStart;i<=aEnd;i++){
            res.add(A.get(i));
        }
        return res;

    }
}
