class Solution(object):
    def reverse(self, x):
        
        num = 0
        sign = 1

        if x < 0:
            sign = -1
            x = -x
        
        while x > 0:
            num = (num*10) + (x%10)
            x = x//10

        num = num * sign
        
        
        if num < -(2**31) or num > (2**31-1):
            return 0
         
        return num
        