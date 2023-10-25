class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        int longestSubstringLength = 0;
        int startIndex = 0;
        int currentIndex = 0;
        for (char character : s.toCharArray()) {
            if (freq.containsKey(character)) {
                int lastCharacterIndex = freq.get(character);
                if (lastCharacterIndex >= startIndex) {
                    if (currentIndex - startIndex > longestSubstringLength) {
                        longestSubstringLength = currentIndex - startIndex;
                    }
                    startIndex = lastCharacterIndex + 1;
                }
            }

            freq.put(character, currentIndex);
            currentIndex++;
        }

        if (currentIndex - startIndex > longestSubstringLength) {
            longestSubstringLength = currentIndex - startIndex;
        }

        return longestSubstringLength;
    }
}
