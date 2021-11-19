public class Solution {
    int count = 0;    
    public int solve(String A, String B) {
        if(A.length()>B.length()) return 0;
        HashMap<ArrayList<Integer>, Integer> freqA = new HashMap<ArrayList<Integer>, Integer>();
        ArrayList<Integer> freq = new ArrayList<Integer>(Collections.nCopies(26, 0));
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            freq.set(c-'a', freq.get(c-'a')+1);
        }
        // freq.stream().forEach((a)->{
        //     System.out.print(a);
        // });
        freqA.put(freq, 1);

        ArrayList<Integer> freqSubString = new ArrayList<Integer>(Collections.nCopies(26, 0));
        int i = 0;
        for(i=0;i<A.length();i++){
            char c = B.charAt(i);
            freqSubString.set(c-'a', freqSubString.get(c-'a')+1);
        }
        // System.out.println();
        // freqSubString.stream().forEach((a)->{
        //     System.out.print(a);
        // });

        
        if(freqA.containsKey(freqSubString)) count++;


        for(int j = i; j<B.length();j++){
            char c1 = B.charAt(j);
            // System.out.println("c1"+c1);
            freqSubString.set(c1-'a',freqSubString.get(c1-'a')+1);
            char c2 = B.charAt(j-A.length());
            // System.out.println("c2"+c2);
            freqSubString.set(c2-'a', freqSubString.get(c2-'a') == 0 ? 0 : freqSubString.get(c2-'a')-1);
            if(freqA.containsKey(freqSubString)) count++;
        }
        return count;
    }

}
