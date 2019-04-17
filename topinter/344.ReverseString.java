class Solution {
    public void reverseString(char[] s) {
        int sLen = s.length;
        for(int i=0; i<sLen/2; i++) {
            char tmp = s[i];
            s[i] = s[sLen-i-1];
            s[sLen-i-1] = tmp;
        }
    }
}
