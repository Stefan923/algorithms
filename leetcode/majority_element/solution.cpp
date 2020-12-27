class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int number = 0, count = 0;
        
        for (int &i : nums) {
            if (count == 0) {
                number = i;
            }
            
            if (number == i) {
                ++count;
            } else {
                --count;
            }
        }
        
        return number;
    }
};
