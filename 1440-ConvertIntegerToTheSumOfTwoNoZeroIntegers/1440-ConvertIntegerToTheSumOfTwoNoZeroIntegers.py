# Last updated: 7/9/2026, 3:10:11 PM
class Solution:
    def getNoZeroIntegers(self, n):   
        for a in range(1, n):
            b = n - a
            if '0' not in str(a) and '0' not in str(b):
                return [a, b]

# Correct way to call (capital S)
print(Solution().getNoZeroIntegers(2))    # [1, 1]
print(Solution().getNoZeroIntegers(11))   # [2, 9] or [8, 3]
