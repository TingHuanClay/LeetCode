class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int commLeng = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            commLeng = Math.min(commLeng, strs[i].length());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commLeng; i++) {
            char chCurr = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != chCurr) {
                    return sb.toString();
                }
            }
            sb.append(chCurr);
        }
        return sb.toString();
    }
}