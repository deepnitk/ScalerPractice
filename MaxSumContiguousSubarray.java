public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        // int max_sum = Integer.MIN_VALUE;
        //O(N3) SOLUTION DOWN HERE
        /*for(int i=0; i<A.size();i++){
            for(int j=i;j<A.size();j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=A.get(k);
                }
                max_sum = Math.max(max_sum, sum);
            }
        }*/
        //O(N2) SOLUTION DOWN HERE
        /*for(int i=0;i<A.size();i++){
            int sum = 0;
            for(int j=i;j<A.size();j++){
                sum+=A.get(j);
                 max_sum = Math.max(max_sum,sum);
            }
           
        }*/

        //O(n) solution down here
        //Kadane's Algoridthm ....

        int max_sum = A.get(0);
        int sum = 0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(sum>max_sum) max_sum = sum;
            if(sum<0) sum =0;
        }
        return max_sum;

    }
}
