/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == NULL || headB == NULL) {
            return NULL;
        }
        
        ListNode *currentNodeA = headA;
        ListNode *currentNodeB = headB;
        
        while (currentNodeA != currentNodeB) {
            currentNodeA = currentNodeA ? currentNodeA->next : headB;
            currentNodeB = currentNodeB ? currentNodeB->next : headA;
        }
        
        return currentNodeA;
    }
};
