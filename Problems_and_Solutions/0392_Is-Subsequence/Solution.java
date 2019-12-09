import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
             return true;
        }
        
        int idxS = 0, idxT = 0;
        while (idxS < s.length() && idxT < t.length() ) {
            if (s.charAt(idxS) == t.charAt(idxT)) {
                idxS++;
                if (idxS == s.length()) {
                    return true;
                }
                
            }
            idxT++;
        }
        return false;
    }
}