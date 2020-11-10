class Solution {
public:
    vector<vector<int>> solution;
    vector<int> set;
    void backtracking(vector<int>& nums, int i) {
        solution.push_back(set);
        
        for (int j = i; j < nums.size(); j++) {
            set.push_back(nums[j]);
            backtracking(nums, j + 1);
            set.pop_back();
        }
    }
    
    vector<vector<int>> subsets(vector<int>& nums) {
        backtracking(nums, 0);
        
        return solution;
    }
};
