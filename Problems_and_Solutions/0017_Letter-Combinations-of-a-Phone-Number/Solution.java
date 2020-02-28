class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> lsRes = new LinkedList<String>();
        if (digits == null || digits.isEmpty()) {
            return lsRes;
        }
        // "0" & "1" is like dummy here, only used for align the index with the number
        // value
        String[] dic = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        char[][] arrDic = new char[10][];
        for (int i = 0; i < dic.length; i++) {
            arrDic[i] = dic[i].toCharArray();
        }

        if (lsRes.isEmpty()) {
            lsRes.add("");
        }
        for (int i = 0; i < digits.length(); i++) {
            // String strTails = dic[Character.getNumericValue(digits.charAt(i))];
            // char[] arrTail = dic[digits.charAt(i) - '0'].toCharArray();
            // use char - '0' to get the index, e.g. '2' - '0' is 2
            char[] arrTail = arrDic[digits.charAt(i) - '0'];

            int size = lsRes.size();
            for (int j = 0; j < size; j++) {
                String head = lsRes.poll();
                for (int k = 0; k < arrTail.length; k++) {
                    lsRes.offer(head + arrTail[k]);
                }
            }
        }
        return lsRes;
    }
}