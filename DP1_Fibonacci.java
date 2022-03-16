import java.lang.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<Integer> fib = new ArrayList<Integer>(Collections.nCopies(a+1, -1));
        System.out.println(solve(a, fib));
    }
    private static int solve(int n, ArrayList<Integer> fib){
        
        if(n<=1) return n;
        if(fib.get(n)!= -1) return fib.get(n);
        fib.set(n, solve(n-1, fib)+solve(n-2, fib));
        return fib.get(n);
    }
}
