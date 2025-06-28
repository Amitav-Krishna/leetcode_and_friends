class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i, item in enumerate(nums):
            if (target - item) not in nums:
                continue
            else:

                for j, item_j in enumerate(nums):
                    if i == j:
                        continue
                    elif item_j != (target - item):
                        continue
                    else:
                        return [i, j]
solution = Solution()
print(solution.twoSum([3, 2, 4], 6))
