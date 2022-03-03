public class Solution {
    public int solve(ArrayList<Integer> A) {
        //Build a Heap
        for(int i=A.size()-1; i>=0; i--){
            sink(A, i);
        }
        int sum =0;
        while(A.size()>1){
            
            int first = A.get(0);
            delete(A);
            
            int second = A.get(0);
            delete(A);

            sum = sum+first+second ;
            insert(A, (first+second));
        }

        return sum;
    }

    public void sink(ArrayList<Integer> A, int i){
        while((left(i)<A.size() && A.get(i) > A.get(left(i))) || (right(i)<A.size() && A.get(i) > A.get(right(i)))){
            int smaller =left(i);
            if(right(i)<A.size() && A.get(right(i)) < A.get(left(i))){
                smaller = right(i);
            }
            swap(A, i, smaller);
            i=smaller;
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
        while(parent(i)<A.size() && A.get(parent(i)) > A.get(i)){
            swap(A, parent(i), i);
            i=parent(i);
        }
    }
}
