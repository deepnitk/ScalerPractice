public class Solution {
    int count = 0;
    public int solve(ArrayList<Integer> A) {
        if(A.size()<2) return 0;
        Collections.sort(A);
        getPermutation(A, 0);
        return count;
    }
    void getPermutation(ArrayList<Integer> A, int i){

        if(i == A.size()){
           

            count+=1;
            return;
        }
        Set<Integer> visitedIdx = new HashSet<Integer>();
        for(int k=i;k<A.size();k++){
            if(visitedIdx.contains(A.get(k)) || (i!=k && A.get(i) == A.get(k))) continue;
            swap(A, i, k);
            if(i==0 || (i>0 && isSquare(A.get(i)+A.get(i-1))))
                getPermutation(A, i+1);
            swap(A, i, k);
            visitedIdx.add(A.get(k));
        }
    }

    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public boolean isSquare(int x){
        int t = (int)Math.sqrt(x);
        return t*t == x;
    }

}
