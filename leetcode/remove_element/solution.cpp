class Solution {
    
public:
    int removeElement(vector<int>& nums, int val) {
        for (int i = nums.size() - 1; i >= 0; --i) {
            if (nums[i] == val) {
                if (i == nums.size() - 1) {
                    nums.pop_back();
                } else {
                    nums[i] = nums.back();
                    nums.pop_back();
                }
            }
        }
        
        return nums.size();
    }
    
};
