
/*
 * Rules: 1. You can add opening parenthese when lefting openning 2. You can add
 * closing parenthese when #(opening) is more than #(closing)
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateParenthesis(n, res, n, n, "");
        return res;
    }

    public void generateParenthesis(int max, List<String> res, int remainOpening, int remainClosing, String curr) {
        if (remainClosing == 0) {
            res.add(curr);
            return;
        }

        // Case 1: add opening parentheses
        if (remainOpening > 0) {
            generateParenthesis(max, res, remainOpening - 1, remainClosing, curr + "(");
        }
        // Case 2: add closing parentheses
        if (remainClosing > 0 && remainClosing > remainOpening) {
            generateParenthesis(max, res, remainOpening, remainClosing - 1, curr + ")");
        }
    }
}