public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> dq = new LinkedList<Character>();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            // prepare freq map on the fly
            hm.put(ch, hm.getOrDefault(ch, 0)+1);

            if(hm.get(ch)>1)
            {
                while(!dq.isEmpty() && hm.get(dq.getFirst())>1)
                {
                    dq.removeFirst();
                }
            }
            else
            {
                dq.addLast(ch);
            }

            if(!dq.isEmpty())
            {
                sb.append(dq.getFirst());
            }
            else
            {
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
