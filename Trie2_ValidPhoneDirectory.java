public class Solution {
    class TrieNode{
        HashMap<Character,TrieNode> child=new HashMap<Character,TrieNode>();
        int freq=0;
        boolean isEnd = false;
    }
    TrieNode root = new TrieNode();
    public int solve(ArrayList<String> A) {
        for(String s:A){
            insert(root,s);
        }
        for(String s:A){
            int isPresent = search(root, s);
            if(isPresent == 1) return 0;
        }
        return 1;
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
        if(current.isEnd && current.freq>1) return 1;
        return 0;
    }

}
