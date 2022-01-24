public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<A.size();i++){
            if(hs.contains(A.get(i)))
                continue;
            else{
                hs.add(A.get(i));
            }
        }
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(hs.contains(A.get(i)-1)) continue;
            else {
                int count = 1;
                while(hs.contains(A.get(i)+count)){
                    count++;
                }
                ans= Math.max(ans,count);
            }
        }
        return ans;
    }
}
