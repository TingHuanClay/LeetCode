class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sumL, sumR = 0, sum(nums)
        for idx, num in enumerate(nums):
            sumR -= num
            if sumL == sumR:
                return idx
            sumL += num
        return -1