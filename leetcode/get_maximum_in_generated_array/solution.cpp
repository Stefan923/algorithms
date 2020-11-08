class Solution {
private:
    int maximum[101] = { 0, 1, 0 };
    
public:
    int getMaximumGenerated(int n) {
        for (int i = 2; i <= n; i++) {
            maximum[i] = (i % 2 == 0) ? maximum[i / 2] : (maximum[i / 2] + maximum[i / 2 + 1]);
        }
        for (int i = 2; i <= n; i++) {
            maximum[i] = max(maximum[i], maximum[i - 1]);
        }
        return maximum[n];
    }
};
