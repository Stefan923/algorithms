class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i : nums) {
            sum = Math.max(i, sum + i);
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
    }
}
