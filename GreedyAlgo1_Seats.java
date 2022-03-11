public class Solution {
    public int seats(String A) {
        long res = 0;
        int n = A.length();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i =0; i<A.length();i++){
            char c = A.charAt(i);
            if(c == 'x') pos.add(i);
        }
        
        int m = pos.size();
        int mid = m/2;
        int left = mid-1, right = mid+1, k=1;
        while(left>=0){
            res+=pos.get(mid) -k - pos.get(left);
            res%=10000003;
            left--;
            k++;
        }
        k=1;
        while(right<m){
            res+=pos.get(right) -k -pos.get(mid);
            res%=10000003;
            right++;
            k++;
        }
        return (int)res;
    }
}
