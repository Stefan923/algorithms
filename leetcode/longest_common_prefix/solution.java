class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        
        String shortestString = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            if (shortestString.length() < strs[i].length()) {
                shortestString = strs[i];
            }
        }
        
        for (int i = 0; i < strs.length; ++i) {
            while (!strs[i].startsWith(shortestString)) {
                shortestString = shortestString.substring(0, shortestString.length() - 1);
            }
        }
        
        return shortestString;
    }
    
}
