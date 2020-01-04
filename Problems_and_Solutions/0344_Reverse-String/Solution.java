class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        int idxStart = 0, idxEnd = s.length - 1;
        while (idxStart < idxEnd) {
            swap(s, idxStart, idxEnd);
            idxStart++;
            idxEnd--;
        }
    }

    private void swap(char[] s, int idxStart, int idxEnd) {
        char tmp = s[idxStart];
        s[idxStart] = s[idxEnd];
        s[idxEnd] = tmp;
    }
}