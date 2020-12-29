class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0;
        int maxSum = INT_MIN;
        
        for (int i : nums) {
            sum = max(i, sum + i);
            maxSum = max(maxSum, sum);
        }
        
        return maxSum;
    }
};
