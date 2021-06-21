class Solution {
    
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    private int binarySearch(int[] nums, int target, int left, int right) {
        if (right < left) {
            return left;
        }
        
        if (right == left) {
            return (nums[left] >= target) ? left : left + 1;
        }
        
        int mid = left + ((right - left) >> 1);
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return binarySearch(nums, target, left, mid - 1);
        }
        return binarySearch(nums, target, mid + 1, right);
    }
    
}
