class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        genSubsets(res, nums, new LinkedList<Integer>(), 0);
        return res;
    }

    public void genSubsets(List<List<Integer>> res, int[] nums, LinkedList<Integer> tmp, int idxStart ) {
        //Add current temp list into results
        res.add(new ArrayList<Integer>(tmp));
        
        for (int i = idxStart; i < nums.length; i++) {
            tmp.add(nums[i]);
            genSubsets(res, nums, tmp, i+1);
            tmp.removeLast();
        }
    }
}