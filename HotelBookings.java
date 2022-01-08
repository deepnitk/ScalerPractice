public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n=arrive.size();
        int i=0; int j = 0, count =0;
       while(i<n && j< n) {
            if(arrive.get(i)<=depart.get(j)){
                count++;
                i++;
            } else{
                count--;
                j++;
            }
            if(count>k) return false;
        }
        return true;
    }
}
