public class Solution {

    class TrieNode{
        HashMap<Character,TrieNode> child=new HashMap<Character,TrieNode>();
        int freq=0;
        boolean isEnd = false;
        int val = 0;
    }
    TrieNode root = new TrieNode();
    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<Integer> B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            String str = A.get(i);
            int val = B.get(i);
            if(val==-1){
                int hashVal = search(root, str);
                res.add(hashVal);
            } else {
                insert(root, str, val);
            }
        }

        return res;
    }

    public void insert(TrieNode root, String word, int val){
        TrieNode current=root;
        int currVal = searchIfExists(root, word);
        val = val - currVal;
        for(char c:word.toCharArray()){
            //create a new node if it doesnt exist
            current.child.putIfAbsent(c,new TrieNode());
            //increment the freq of that Character
            current.child.get(c).freq++;
            // insert val
            current.child.get(c).val+=val;
            //go to the next node
            current=current.child.get(c);
        }
        current.isEnd = true;
        // current.val = val;
    }

    public int search(TrieNode root, String word){
        TrieNode current=root;
        for(char c:word.toCharArray()){
            if(current.child.get(c) == null) return 0;
            current=current.child.get(c);
        }
        return current.val;
    }

    public int searchIfExists(TrieNode root, String word){
        TrieNode current=root;
        for(char c:word.toCharArray()){
            if(current.child.get(c) == null) return 0;
            current=current.child.get(c);
        }
        if(current.isEnd) return current.val;
        return 0;
    }



}
