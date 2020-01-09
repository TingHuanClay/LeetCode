class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int globalOptimal = 0, localOptimal = 0;
        for (int n : nums) {
            // if (n==1) {
            // globalOptimal = Math.max(globalOptimal, ++localOptimal);
            // } else {
            // localOptimal = 0;
            // }

            // Enhance src code above to one line as below
            globalOptimal = Math.max(globalOptimal, localOptimal = (n == 1) ? localOptimal + 1 : 0);
        }
        return globalOptimal;

    }
}