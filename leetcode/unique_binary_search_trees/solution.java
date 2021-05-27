class Solution {
    
    public int numTrees(int n) {
        int[] treesCount = new int[n + 1];
        treesCount[0] = 1;
        
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                treesCount[i] += treesCount[j - 1] * treesCount[i - j];
            }
        }
        
        return treesCount[n];
    }
    
}
