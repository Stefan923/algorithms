/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        
        while (currentNode != null) {
            if (previousNode.val == currentNode.val) {
                previousNode.next = currentNode.next;
                currentNode = previousNode;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        
        return head;
    }
    
}
