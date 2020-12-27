class Solution {
    public String thousandSeparator(int n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
        int size = stringBuilder.length() - 3;
    
        while (size > 0) {
            stringBuilder.insert(size, ".");
            size -= 3;
        }
        
        return stringBuilder.toString();
    }
}
