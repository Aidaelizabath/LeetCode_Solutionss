class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left =0
        right = len(height)-1
        max_amount = 0
        while left <right:
            width = right - left
            heightt = min( height[right],height[left])
            area = width * heightt
            max_amount = max(max_amount,area)
            if height[right]<height[left]:
                right -=1
            else:
                left +=1
        return max_amount

        