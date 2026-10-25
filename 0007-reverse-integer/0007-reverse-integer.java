class Solution {
    public int reverse(int x) { 
        long digit = 0;
        while(x != 0){
            int num = x % 10;
            digit = digit * 10 + num;
            x = x / 10;
            
        }
        if(digit > Integer.MAX_VALUE || digit < Integer.MIN_VALUE){
            return 0;
        }
       
        return (int)digit;
        
        
    }
}