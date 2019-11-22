class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean res = false;
        if (s == null || t == null || s.length() != t.length()) {
            return res;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            if (!map.containsKey(cS)) {
                if (!map.containsValue(cT)) {
                    map.put(cS, cT);
                } else {
                    return false;
                }
            } else if (!map.get(cS).equals(cT)) {
                    return false;
            }
        }
        return true;
    }
}