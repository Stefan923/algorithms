class Solution {
    
public:
    int myAtoi(string s) {
        long long number = 0;
        int index = 0;
        int sign = 1;
        
        while (s[index] == ' ') ++index;
        
        if (s[index] == '-') {
            sign = -1;
            ++index;
        } else if (s[index] == '+') {
            ++index;
        }
        
        for (; s[index] >= '0' && s[index] <= '9'; ++index) {
            number *= 10;
            number += s[index] - '0';
            
            if (sign * number <= INT_MIN) {
                return INT_MIN;
            } else if (sign * number >= INT_MAX) {
                return INT_MAX;
            }
        }
        
        return sign * number;
    }
    
};
