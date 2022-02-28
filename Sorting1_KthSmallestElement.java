public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            input.add(A.get(i));
        }
        for(int i=0;i<B;i++){
            int min=Integer.MAX_VALUE, idx=-1;
            for(int j=i;j<input.size();j++){
                if(input.get(j)<min){
                    min = input.get(j);
                    idx=j;
                }
            }
            swap(input, i, idx);
            
        }
        return input.get(B-1);
    }

    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
        return;
    }
}
