class Solution {
    
    public boolean checkZeroOnes(String s) {
        boolean previousIsZero = false;
        int maximumZeros = 0;
        int maximumOnes = 0;
        int currentZeros = 0;
        int currentOnes = 0;
        
        for (char digit : s.toCharArray()) {
            if (digit == '0') {
                if (!previousIsZero) {
                    maximumOnes = Math.max(maximumOnes, currentOnes);
                    currentOnes = 0;
                    previousIsZero = true;
                }
                ++currentZeros;
            } else {
                if (previousIsZero) {
                    maximumZeros = Math.max(maximumZeros, currentZeros);
                    currentZeros = 0;
                    previousIsZero = false;
                }
                ++currentOnes;
            }
        }
        maximumOnes = Math.max(maximumOnes, currentOnes);
        maximumZeros = Math.max(maximumZeros, currentZeros);
        
        return maximumOnes > maximumZeros;
    }
    
}
