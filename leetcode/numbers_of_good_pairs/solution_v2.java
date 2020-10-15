class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int numberOfPairs = 0;
        
        for (int num : nums)
            pairs.put(num, pairs.getOrDefault(num, 0) + 1);
        
        for (int numCount : pairs.values())
            numberOfPairs += numCount * (numCount - 1) / 2;
        
        return numberOfPairs;
    }
}
