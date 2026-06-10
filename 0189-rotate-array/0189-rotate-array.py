class Solution(object):
    def rotate(self, nums, k):
        k = k % len(nums)
        if k ==0:
            return
        nums.reverse()
        nums[:k]= reversed(nums[:k])
        nums[k:]= reversed(nums[k:])


