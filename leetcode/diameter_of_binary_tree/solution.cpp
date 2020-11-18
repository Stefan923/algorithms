class Solution {
public:
    int diameter(TreeNode *root, int &result) {
        if (root == NULL) {
            return 0;
        }
        
        int heightL = diameter(root->left, result);
        int heightR = diameter(root->right, result);
        
        result = max(result, heightL + heightR);
        return max(heightL, heightR) + 1;
    }
    
    int diameterOfBinaryTree(TreeNode* root) {
        int result = 0;
        diameter(root, result);
        return result;
    }
};
