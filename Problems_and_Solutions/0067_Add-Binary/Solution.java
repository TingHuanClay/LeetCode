class Solution {
    public String addBinary(String a, String b) {
        int idxA = a.length() - 1;
        int idxB = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (idxA >= 0 || idxB >= 0) {
            int sum = carry;
            if (idxA >= 0) {
                sum += (a.charAt(idxA--) - '0');
            }
            if (idxB >= 0) {
                sum += (b.charAt(idxB--) - '0');
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}