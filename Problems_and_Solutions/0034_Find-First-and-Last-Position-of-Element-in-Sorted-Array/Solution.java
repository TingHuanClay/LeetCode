class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearchFirst(nums, target);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int last = binarySearchLast(nums, target);
        return new int[] { first, last };
    }

    private int binarySearchFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                // update First index
                result = mid;
            }

            if (nums[mid] >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    private int binarySearchLast(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                // update Last index
                result = mid;
            }

            if (nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return result;
    }
}