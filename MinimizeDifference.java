Given an array of integers A of size, N. Minimize the absolute difference between the maximum and minimum element of the array.

You can perform two types of operations at most B times in total to change the values in the array.
Multiple operations can be performed on the same element.
  
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int a:A){
            if(freq.containsKey(a))
                freq.put(a,freq.get(a)+1);
            else{
                freq.put(a,1);
                // System.out.println("a:"+a);
            }
        }
        int max = Collections.max(A);
        int min = Collections.min(A);
        // System.out.println("max:"+max);
        // System.out.println("min:"+min);
        
        while((min<max) && (B!=0)){
            if(freq.get(min)<freq.get(max)){
                // System.out.println("freq.get(min):"+freq.get(min));
                // System.out.println("freq.get(max):"+freq.get(max));
                // System.out.println("B:"+B);
                
                if(B<freq.get(min))
                    break;
                freq.put(min+1, freq.getOrDefault(min+1,0)+freq.get(min));
                // System.out.println("freq.get(min+1):"+freq.get(min+1));
                B = B - freq.get(min);
                // System.out.println("B after increment:"+B);
                min++;
                // System.out.println("min is if:"+min);
            }
            else{
                if(B<freq.get(max))
                    break;
                freq.put(max-1, freq.getOrDefault(max-1,0)+freq.get(max));
                // System.out.println("freq.get(max+1):"+freq.get(max+1));
                B = B - freq.get(max);
                // System.out.println("B after decrement:"+B);
                max--;
                // System.out.println("max in else:"+max);
                
            }
        }
        return (max-min);
    } 
}
