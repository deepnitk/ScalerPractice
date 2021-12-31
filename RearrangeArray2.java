public class Solution {
	public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for(int i=0 ; i<a.size();i++) a.set(i,a.get(i)*n);
        for(int i=0;i<a.size();i++) {
            int ind = a.get(i)/n;
            a.set(i,a.get(i)+(a.get(ind)/n));
        }
        for(int i=0;i<n;i++) a.set(i,a.get(i)%n);
	}
}
