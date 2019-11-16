class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tmp, int[] nums, int start) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i = 0 ; i < nums.length ; i++) {
            if (!tmp.contains(nums[i])) {
                tmp.add(nums[i]);
                backtrack(res, tmp, nums, i + 1);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}