class Solution {
    
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = length - 1; i >= 0; --i) {
            if (nums[i] == val) {
                if (i == length - 1) {
                    --length;
                } else {
                    nums[i] = nums[--length];
                }
            }
        }
        
        return length;
    }
    
}
