class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int count = 0;
        unordered_map<int, int> map;
        
        for (int i = 0; i < nums.size(); i++)
            map[nums[i]]++;
        
        for (auto p : map)
            count += p.second * (p.second - 1) / 2;
        
        return count;
    }
};
