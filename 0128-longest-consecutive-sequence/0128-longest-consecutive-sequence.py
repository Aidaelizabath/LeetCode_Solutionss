class Solution(object):
    def longestConsecutive(self, nums):

        set1 = set(nums)
        longest_seq = 0
        current_num =0
        length =0
        for num in set1:

            if num-1 not in set1:
                current_num= num
                length =1 
                while current_num+1 in set1:
                    current_num +=1
                    length +=1
                longest_seq = max(longest_seq,length)
        return longest_seq
    
            


 

