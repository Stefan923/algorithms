class Solution {
public:
    int numTeams(vector<int>& rating) {
        int teams = 0, n = rating.size();
        
        for (int i = 1; i < n - 1; i++) {
            int greaterL = 0, greaterR = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] > rating[i]) {
                    greaterL++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    greaterR++;
                }
            }
            teams += (i - greaterL) * greaterR + greaterL * (n - 1 - i - greaterR);
        }
        
        return teams;
    }
};
