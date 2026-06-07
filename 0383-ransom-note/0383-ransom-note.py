class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        freq={}
        for char in magazine:
            freq[char]=freq.get(char,0)+1
        for char in ransomNote:
            if char not in magazine:
                return False
            else:
                freq[char]-=1
                if freq[char]<0:
                    return False
        return True
        
        
        


    