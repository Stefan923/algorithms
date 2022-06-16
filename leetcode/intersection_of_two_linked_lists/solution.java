/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        
        while (currentNodeA != currentNodeB) {
            currentNodeA = currentNodeA == null ? headB : currentNodeA.next;
            currentNodeB = currentNodeB == null ? headA : currentNodeB.next;
        }
        
        return currentNodeA;
    }
    
}
