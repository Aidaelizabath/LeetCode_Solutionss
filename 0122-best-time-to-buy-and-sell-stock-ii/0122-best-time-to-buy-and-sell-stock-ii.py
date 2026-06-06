class Solution(object):
    def maxProfit(self, prices):
       i =0
       j=1
       profit =0
       for j in range(len(prices)):
        if prices[j]>prices[i]:
            profit += prices[j]-prices[i]
        i=j
       return profit