

/*
A[i] + A[j] = S
S < K
i < j

return max(S)


worst case of Time complexity is O(n^2)
to traverse each pair one time and update the max(S)

Notices:
    1. NOT guaranteed Uniqu value in the array.
       
    2. Don't be fooled by 'i < j'
       you can find only one pair of (i , j) to fit 'i < j' 
       e.g.
            when i = 1, j = 4, you would get the pair (1, 4)
            when i = 4, j = 1, you would get the pair (1, 4)
       We don't need to return (i,j) but only SUM of A[i] & A[j]
       
       =>
       the original value of i & j is NOT important at all
       even though you sort the array and it would not impact the return value
       
Solution: 
1. sorting the array
2. traverse the pair form both end of the array

Time Complexity: O(nlogn), based on the sorting part
Space Complexity: O(1), NO extra space required
*/
class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int left = 0, right = A.length - 1, res = -1;
        Arrays.sort(A);
        while (left < right) {
            int tmp = A[left] + A[right];
            if (tmp < K) {
                if (tmp > res && tmp < K) {
                    res = tmp;
                }
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}