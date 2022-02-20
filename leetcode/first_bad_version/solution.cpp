class Solution {
    
public:
    int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int middle = left + (right - left) / 2;
            bool badVersion = isBadVersion(middle);
            
            if (!badVersion && isBadVersion(middle + 1)) {
                return middle + 1;
            } else if (badVersion) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        
        return isBadVersion(left) ? left : left + 1;
    }
    
};
