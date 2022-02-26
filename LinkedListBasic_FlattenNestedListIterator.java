// public class Main {
//     public static void main(String[] args) {
        
//     }
    
//     // This is the interface that allows for creating nested lists.
//     // You should not implement it, or speculate about its implementation.
//     class NestedInteger {
        
//         NestedInteger(int x) {
//         }
        
//         // Return true if this NestedInteger holds a single integer, rather than a nested list.
//         boolean isInteger() {
//         }

//         // Return the single integer that this NestedInteger holds, if it holds a single integer.
//         // The result is 1e9 if this NestedInteger holds a nested list.
//         int getInteger() {
            
//         }

//         // Return the nested list that this NestedInteger holds, if it holds a nested list.
//         // The result is an empty ArrayList if this NestedInteger holds a single integer.
//         ArrayList<NestedInteger> getList() {
            
//         }
//     }

class NestedIterator {

        private List<Integer> elements = new ArrayList<>();
        int index = 0;
        NestedIterator(ArrayList<NestedInteger> nestedList) {
            init(nestedList); 
        }

        int next() {
            return elements.get(index++);
        }

        boolean hasNext() {
            if (index < this.elements.size())
                return true;
            else
                return false;
        }

        private void init(ArrayList<NestedInteger> nestedList) {
            if (nestedList.isEmpty())
                return;
            for (NestedInteger nst : nestedList) {
                if (!nst.isInteger()) {
                    init(nst.getList());
                } else
                    elements.add(nst.getInteger());
            }
        }
    }
