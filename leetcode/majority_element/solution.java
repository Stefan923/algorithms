class Solution {
    public int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;
        
        for (int i : nums) {
            if (count == 0) {
                number = i;
            }
            
            if (number == i) {
                ++count;
            } else {
                --count;
            }
        }
        
        return number;
    }
}
