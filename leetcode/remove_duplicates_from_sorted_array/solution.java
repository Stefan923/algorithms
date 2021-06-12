class Solution {
    
    public int removeDuplicates(int[] nums) {
        int removedElements = 0;
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[i]) {
                ++removedElements;
            } else {
                nums[i - removedElements] = nums[i];
            }
        }
        
        return nums.length - removedElements;
    }
    
}
