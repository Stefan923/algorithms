class Solution {
public:
    bool checkPossibility(vector<int>& nums) {
        int pos = -1, n = nums.size() - 1;
        
        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] > nums[i]) {
                if (pos != - 1) {
                    return false;
                }
                pos = i;
            }
        }
        
        return (pos == -1) ||
            (pos == 1 || pos == n) ||
            (nums[pos - 1] <= nums[pos + 1] || nums[pos - 2] <= nums[pos]);
    }
};
