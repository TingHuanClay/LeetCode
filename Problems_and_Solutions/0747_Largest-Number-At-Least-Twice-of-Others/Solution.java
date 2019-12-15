/**
    Time  Complexity: O(n)
    Space Complexity: O(1)
    
    Idea:
        Use two extra space to keep TOP 2 values in the array
        There is an asnwer when largest/2 >= second 
*/
class Solution {
    public int dominantIndex(int[] nums) {
        int idxLargest = -1;
        int largest = -1, second = -1;

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
                idxLargest = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        
        // Leverage "nums[idxLargest]/2.0" to avoid overflow risk 
        // on "2 * nums[idxSlow]"
        return (largest/2.0 >= second) ? idxLargest : -1;
    }
}
