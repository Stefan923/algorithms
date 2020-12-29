class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int n = arr.size();
        if (n == 1) {
            return arr[0];
        }
        
        float requiredCnt = n * 0.25;
        int element = arr[0], cntElement = 1;
        for (int i = 1; i < n; ++i) {
            cout << element << " " << cntElement << "\n";
            if (element != arr[i] || i + 1 == n) {
                cntElement += (i + 1 == n) ? 1 : 0;
                if (cntElement > requiredCnt) {
                    return element;
                }
                
                cntElement = 1;
                element = arr[i];
            } else {
                ++cntElement;
            }
        }
        
        return -1;
    }
};
