class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        int last = 0;
        
        sort(intervals.begin(), intervals.end());   // O(N * logN)
        
        result.push_back(intervals[0]);
        for (int i = 1; i < intervals.size(); ++i) {
            if (result[last][1] >= intervals[i][0]) {
                result[last][1] = max(result[last][1], intervals[i][1]);
            } else {
                result.push_back(intervals[i]);
                ++last;
            }
        }
        
        return result;
    }
};
