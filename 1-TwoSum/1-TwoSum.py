# Last updated: 7/9/2026, 3:14:12 PM
class Solution:
    def twoSum(self, nums, target):
        n=len(nums)
        for i in range(n):
            for j in range(i+1,n):
                if nums[i]+nums[j] == target:
                    return [i,j]



        