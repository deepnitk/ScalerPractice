public class Solution {
    public int threeSumClosest(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE, closestSum = 0;
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            
            while(l<r){
                int sum = A[i]+A[l]+A[r];
                int diff = Math.abs(sum-B);
                if(minDiff > diff){
                    minDiff = diff;
                    closestSum = sum;
                }
                if(sum == B) return B;
                if(sum < B) l++;
                if(sum>B) r--;
            }
        }
        return closestSum;
    }
}
