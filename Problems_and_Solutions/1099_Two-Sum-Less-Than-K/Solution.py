class Solution:
    def twoSumLessThanK(self, A: List[int], K: int) -> int:
        A.sort()
        left, right, res = 0, len(A) - 1, -1
        while left < right:
            tmp = A[left] + A[right]
            if tmp < K:
                res = max(res, tmp)
                left += 1
            else:
                right -= 1
        return res