/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode head;
    int size = 0;
    public ListNode solve(int[][] A) {
         for (int i = 0;i < A.length;i++){
            if (A[i][0] == 0){
                addAtFirst(A[i][1]);
            } else if (A[i][0] == 1) {
                addAtLast(A[i][1]);
            } else if (A[i][0] == 2) {
                addNode(A[i][1], A[i][2]);                
            } else if (A[i][0] == 3){
                deleteByValue(A[i][2], A[i][1]);
            }
        }
        return head;
    }

    public void addAtFirst(int value) {
        if (head == null){
            head = new ListNode(value);
        } else {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }
        size += 1;
    }

    public void addAtLast(int value){
        ListNode newnode = new ListNode(value);
        ListNode temp = head;
        if (head == null) {
            head = newnode;
        } else {
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size += 1;
    }

    public void addAtIndex(int value, int index){
        int count = 0;
        ListNode temp = head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = temp.next;
        temp.next = newNode;
        size += 1;
    }

     public void addNode(int value, int index){
        if (index == size){
            addAtLast(value);
        } else if (index > size || index < 0){
            return;
        } else if (index == 0) {
            addAtFirst(value);
        } else {
            addAtIndex(value, index);
        }
    } 

    public void deleteByValue(int value, int position){
        if (head == null) return;
        ListNode ptr = head;
        if (position < size) {
            if (position == 0){
                head = head.next;
            } else {
                for(int k = 0;k < position - 1;k++) {
                    ptr = ptr.next;
                }
                ptr.next = ptr.next.next;
            }
            size -= 1;
        }
    }
}
