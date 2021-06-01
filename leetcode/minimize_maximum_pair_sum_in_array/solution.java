class Solution {
    
    public int minPairSum(int[] nums) {
        int maximumSum = 0;
        int length = nums.length;
        
        Arrays.sort(nums);
        for (int i = 0; i < length / 2; ++i) {
            maximumSum = Math.max(maximumSum, nums[i] + nums[length - i - 1]);
        }
        
        return maximumSum;
    }
    
}
