class Solution {
    
    public int myAtoi(String s) {
        long number = 0;
        int index = 0;
        int sign = 1;
        
        if (s.length() == 0) {
            return 0;
        }
        
        while (index < s.length() && s.charAt(index) == ' ') ++index;
        
        if (index < s.length() && s.charAt(index) == '-') {
            sign = -1;
            ++index;
        } else if (index < s.length() && s.charAt(index) == '+') {
            ++index;
        }
        
        for (; index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9'; ++index) {
            number *= 10;
            number += s.charAt(index) - '0';
            
            if (sign * number <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (sign * number >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        
        return (int) (sign * number);
    }
    
}
