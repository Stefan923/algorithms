class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int, int> apparitions;
        int n = nums.size();
        int half = n / 2;
        
        for (int i = 0; i < n; ++i) {
            ++apparitions[nums[i]];
            
            if (apparitions[nums[i]] > half)
                return nums[i];
        }
        
        return -1;
    }
};
