class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int original = x;
        int digit = 0;
      while(x>0){
        int num = (x%10);
        digit = (digit*10) + num;
       x = x / 10;

      } 
      if(original == digit){
        return true;
      }
      return false;
        
    }
}