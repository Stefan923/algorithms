class Solution {
    
    public int reverse(int x) {
        long reversedNumber = 0;
        int sign = (x >= 0) ? 1 : -1;
        x = Math.abs(x);
        
        while (x > 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return (reversedNumber > Integer.MAX_VALUE) ? 0 : (int) (sign * reversedNumber);
    }
    
}
