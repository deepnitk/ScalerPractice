Given an integer array A of size N.
You need to sort the elements in increasing order using SelectionSort. Return a array containing the min value's index position before every iteration.
NOTE:
Consider 0 based indexing while looking for min value in each step of selection sort.
There will be total N - 1 iterations in selection sort so the output array will contain N - 1 integers.
  

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        getSort(A, A.size(), 0, result);
        return result;
    }
    public static void getSort(ArrayList<Integer> A, int n, int index, ArrayList<Integer> result){
        if(index == n-1)
            return;
        int k = minIndex(A, index, n-1);
        if(k!=index){
        int temp = A.get(k);
        A.set(k, A.get(index));
        A.set(index, temp);
        }
        result.add(k);
        getSort(A, n, index+1, result);
    }
    static int minIndex(ArrayList<Integer> A, int i, int j){
        if(i==j)
            return i;
        int k= minIndex(A, i+1,j);
        return (A.get(i)<A.get(k))? i:k;
    }
}
