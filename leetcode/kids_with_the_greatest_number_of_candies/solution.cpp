class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> greatestNum;
        int greatest = 0;
        for (int i = 0; i < candies.size(); i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }
        
        for (int i = 0; i < candies.size(); i++) {
            greatestNum.push_back(candies[i] + extraCandies >= greatest);
        }
        return greatestNum;
    }
};
