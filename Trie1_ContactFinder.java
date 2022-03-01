public class Solution {

    class TrieNode{
        HashMap<Character,TrieNode> child=new HashMap<Character,TrieNode>();
        int freq=0;
        boolean isEnd = false;
    }
    TrieNode root = new TrieNode();
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            int op = A.get(i);
            if(op== 0) {
                // System.out.println("inserting");
                insert(root, B.get(i));
            }
            else {
                // System.out.println("searching");
                int count = search(root, B.get(i));
                res.add(count);
            }
        }
        return res;
    }

    public void insert(TrieNode root,String word){
        TrieNode current=root;
        for(char c:word.toCharArray()){
            //create a new node if it doesnt exist
            current.child.putIfAbsent(c,new TrieNode());
            //increment the freq of that Character
            current.child.get(c).freq++;
            //go to the next node
            current=current.child.get(c);
        }
        current.isEnd = true;
    }

    public int search(TrieNode root, String word){
        TrieNode current=root;
        for(char c:word.toCharArray()){
            if(current.child.get(c) == null) return 0;
            current=current.child.get(c);
        }
        // System.out.println("current.isEnd"+current.isEnd);
        // System.out.println("current.freq"+current.freq);
        return current.freq;
    }
}
