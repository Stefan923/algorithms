class Solution {
    
    public String replaceDigits(String s) {
        int length = s.length();
        
        if (length == 1) {
            return s;
        }
        
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 1; i < length; i += 2) {
            char letter = s.charAt(i - 1);
            stringBuilder
                .append(letter)
                .append((char)(letter + s.charAt(i) - '0'));
        }
        
        if (stringBuilder.length() != length) {
            stringBuilder.append(s.charAt(length - 1));
        }
        
        return stringBuilder.toString();
    }
    
}
