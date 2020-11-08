class Solution {
public:
    int numTeams(vector<int>& rating) {
        int teams = 0, n = rating.size();
        
        for (int i = 1; i < n - 1; i++) {
            int lowerL = 0, greaterL = 0, lowerR = 0, greaterR = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] > rating[i]) {
                    greaterL++;
                } else {
                    lowerL++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    greaterR++;
                } else {
                    lowerR++;
                }
            }
            teams += lowerL * greaterR + greaterL * lowerR;
        }
        
        return teams;
    }
};
