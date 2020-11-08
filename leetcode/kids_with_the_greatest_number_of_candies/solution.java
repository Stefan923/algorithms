class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hasGreatest = new ArrayList<>();
        int greatest = 0;
        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }
        
        for (int i = 0; i < candies.length; i++) {
            hasGreatest.add(candies[i] + extraCandies >= greatest);
        }
        
        return hasGreatest;
    }
}
