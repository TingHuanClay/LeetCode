class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        idxLargest, largest, second = -1, -1, -1
        for index, num in enumerate(nums):
            if num > largest:
                second = largest
                largest = num
                idxLargest = index
            elif num > second:
                second = num

        if largest/2.0 < second:
            idxLargest = -1

        return idxLargest
        