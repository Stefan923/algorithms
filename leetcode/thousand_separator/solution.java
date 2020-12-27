class Solution {
    public String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }
        
        int needsDot = 0;
        String output = "";
        
        while (n > 0) {
            if (needsDot == 3) {
                output = "." + output;
                needsDot = 0;
            }
            
            output = (n % 10) + output;
            n /= 10;
            ++needsDot;
        }
        
        return output;
    }
}
