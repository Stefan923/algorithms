/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {

public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = NULL;
        ListNode* currentNode = NULL;
        int sum = 0;
        
        while (l1 || l2) {
            sum += (l1 ? l1->val : 0) + (l2 ? l2->val : 0);
            
            if (result == NULL) {
                result = currentNode = new ListNode(sum % 10);
            } else {
                currentNode->next = new ListNode(sum % 10);
                currentNode = currentNode->next;
            }
            
            sum /= 10;
            
            l1 = l1 ? l1->next : NULL;
            l2 = l2 ? l2->next : NULL;
        }
        
        if (sum != 0) {
            currentNode->next = new ListNode(sum);
        }
        
        return result;
    }

};
