class Solution {
    private List<List<Integer>> solution = new ArrayList<>();
    private List<Integer> set = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        
        return solution;
    }
    
    void backtracking(int[] nums, int i) {
        solution.add(new ArrayList(set));
        
        for (int j = i; j < nums.length; j++) {
            set.add(nums[j]);
            backtracking(nums, j + 1);
            set.remove(set.size() - 1);
        }
    }
}
