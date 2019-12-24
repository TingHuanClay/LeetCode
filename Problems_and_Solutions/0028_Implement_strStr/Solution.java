class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        int res = -1;
        int idxHaystack = 0, idxNeedle = 0;

        while (idxHaystack <= lenHaystack - lenNeedle && idxNeedle < lenNeedle) {
            if (haystack.charAt(idxHaystack + idxNeedle) == needle.charAt(idxNeedle)) {
                idxNeedle++;
            } else {
                idxNeedle = 0;
                idxHaystack++;
            }
        }
        return (idxNeedle == lenNeedle) ? idxHaystack : res;
    }
}