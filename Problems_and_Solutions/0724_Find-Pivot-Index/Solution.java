/*
Time Complexity: O(n)
Space Complexity: O(1)

Step 1: Get the sum of the array
    total 7ms by using Stream   to accumulate sum
    total 1ms by using For-Loop to accumulate sum

Step 2: Traverse the the array one more time and compare the sum of left and right by each index


*/
class Solution {
    public int pivotIndex(int[] nums) {
        // Time: 7ms
        // int sum = IntStream.of(nums).sum();
        
        // Time: 1ms
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
        }

        int sumL = 0, sumR = sum;
        for (int i = 0 ; i < nums.length ; i++) {
            sumR -= nums[i];
            if (sumL == sumR) {
                return i;
            }
            sumL += nums[i];
        }
        return -1;
    }
}