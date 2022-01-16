public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
     quickSort(A,0,A.size()-1);  
     return A; 
    }
    public static void quickSort(ArrayList<Integer> A, int l, int r){
        if(l>=r) return;
        int idx = reArrange(A,l,r);
        quickSort(A,l,idx-1);
        quickSort(A,idx+1,r);
    }

    public static int reArrange(ArrayList<Integer> A, int l, int r){
        int p1=l+1, p2=r;
        while(p1<=p2){
            if(A.get(p1)<=A.get(l)) p1++;
            else if(A.get(p2)>A.get(l)) p2--;
            else {
                swap(A,p1,p2);
                p1++;
                p2--;
            }
        }
        swap(A, l,p1-1);
        return (p1-1);
    }
    
    public static void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
