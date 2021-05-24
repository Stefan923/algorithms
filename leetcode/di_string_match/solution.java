class Solution {
  
    public int[] diStringMatch(String s) {
        int length = s.length();
        int n = length;
        int m = 0;
        int[] result = new int[length + 1];
        char[] stringChars = s.toCharArray();
        
        for (int i = 0; i < length; ++i) {
            if (stringChars[i] == 'I') {
                result[i] = m++;
            } else {
                result[i] = n--;
            }
        }
        result[length] = n;
        
        return result;
    }
  
}
