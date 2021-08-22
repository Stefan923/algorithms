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
        int reminder = 0;
        
        while (l1 != NULL && l2 != NULL) {
            int sum = l1->val + l2->val + reminder;
            
            if (result == NULL) {
                result = currentNode = new ListNode(sum % 10);
            } else {
                currentNode->next = new ListNode(sum % 10);
                currentNode = currentNode->next;
            }
            
            reminder = sum / 10;
            
            l1 = l1->next;
            l2 = l2->next;
        }
        
        while (l1 != NULL) {
            int sum = l1->val + reminder;
            currentNode->next = new ListNode(sum % 10);
            reminder = sum / 10;
            
            currentNode = currentNode->next;
            l1 = l1->next;
        }
        
        while (l2 != NULL) {
            int sum = l2->val + reminder;
            currentNode->next = new ListNode(sum % 10);
            reminder = sum / 10;
            
            currentNode = currentNode->next;
            l2 = l2->next;
        }
        
        if (reminder != 0) {
            currentNode->next = new ListNode(reminder);
        }
        
        return result;
    }
  
};
