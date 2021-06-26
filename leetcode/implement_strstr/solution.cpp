class Solution {

public:
    int strStr(string haystack, string needle) {
        int maxIndex = ((int) haystack.size()) - ((int) needle.size());
        for (int i = 0; i <= maxIndex; ++i) {
            if (startsWith(haystack, needle, i)) {
                return i;
            }
        }
        
        return (haystack.size() + needle.size() == 0) ? 0 : -1;
    }
    
private:
    bool startsWith(string string1, string string2, int i) {
        int j = 0;
        while (string1[i] != 0 && string1[i] == string2[j]) {
            ++i;
            ++j;
        }
        
        return string2[j] == 0 || string1[i] == string2[j];
    }

};
