class Solution {
    public int findSpecialInteger(int[] arr) {
        int requiredCnt = (int) (arr.length * 0.25);
        int element = arr[0], cntElement = 0;
        
        for (int x : arr) {
            if (element != x) {
                element = x;
                cntElement = 1;
            } else {
                ++cntElement;
                
                if (cntElement > requiredCnt) {
                    return element;
                }
            }
        }
        
        return element;
    }
}
