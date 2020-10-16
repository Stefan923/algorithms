class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        
        while (i < j) {
            while (i < j && !Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
                i++;
                   
            while (i < j && !Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j)))
                j--;
                   
            if (i < j && s.charAt(i) != s.charAt(j))
                   return false;
            i++;
            j--;
        }
        
        return true;
    }
}
