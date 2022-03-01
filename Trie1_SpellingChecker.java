public class Solution {

    class TrieNode{
        HashMap<Character,TrieNode> child=new HashMap<Character,TrieNode>();
        boolean isEnd =false;
    }
    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        TrieNode root = new TrieNode();
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        //Put Dictionary in Trie
        for(String s:A){
            insert(root,s);
        }
    
        for(String s:B){
            int isPresent = search(root, s);
            res.add(isPresent);
        }

        return res;
    }

    public void insert(TrieNode root,String word){
        TrieNode current=root;
        for(char c:word.toCharArray()){
            //create a new node if it doesnt exist
            current.child.putIfAbsent(c,new TrieNode());
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
        if(current.isEnd) return 1;
        return 0;
    }


}
