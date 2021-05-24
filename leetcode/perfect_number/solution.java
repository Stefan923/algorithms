class Solution {
    
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                int secondDivisor = num/i;
                
                if (secondDivisor != i) {
                    sum += i + secondDivisor;
                } else {
                    sum += i;
                }
            }
        }
        
        return sum == num && num != 1;
    }
    
}
