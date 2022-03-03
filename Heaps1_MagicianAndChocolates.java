public class Solution {
    public int nchoc(int k, ArrayList<Integer> A) {
        int MOD = 1000000007;
        for(int i=A.size()-1; i>=0; i--){
            sink(A, i);
        }
        long count =0;
        while(k>0){
            int x = A.get(0);
            count+=x;
            count%=MOD;
            delete(A);
            insert(A, x/2);
            k--;
        }
        return (int)count;
    }

    public void sink(ArrayList<Integer> A, int i){
        while((left(i)<A.size() && A.get(i) < A.get(left(i))) || (right(i)<A.size() && A.get(i) < A.get(right(i)))){
            int bigger =left(i);
            if(right(i)<A.size() && A.get(right(i)) > A.get(left(i))){
                bigger = right(i);
            }
            swap(A, i, bigger);
            i=bigger;
        }
    }

    public int left(int i){
        return (i*2)+1;
    }

    public int right(int i){
        return (i*2)+2;
    }

    public int parent(int i){
        return (i-1)/2;
    }

    public void delete(ArrayList<Integer> A){
        swap(A, 0, (A.size()-1));
        A.remove(A.size()-1);
        sink(A, 0);
    }

    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public void insert(ArrayList<Integer> A, int x){
        A.add(x);
        int i = A.size()-1;
        while(parent(i)<A.size() && A.get(parent(i)) < A.get(i)){
            swap(A, parent(i), i);
            i=parent(i);
        }
    }


}
