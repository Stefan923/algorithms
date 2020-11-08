class Solution {
    private int[] maximum = new int[101];
    
    public int getMaximumGenerated(int n) {
        maximum[0] = 0;
        maximum[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            maximum[i] = (i % 2 == 0) ? maximum[i / 2] : (maximum[i / 2] + maximum[i / 2 + 1]);
        }
        
        for (int i = 2; i <= n; i++) {
            maximum[i] = Math.max(maximum[i], maximum[i - 1]);
        }
        
        return maximum[n];
    }
}
