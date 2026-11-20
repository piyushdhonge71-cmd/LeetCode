class Solution {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        str = str.toLowerCase();

        int s = 0;
        int e = str.length() - 1;
        
        while (s < e) {
            char start = str.charAt(s);
            char end = str.charAt(e);

            if (!Character.isLetterOrDigit(start)) {
                s++;
            } 
            else if (!Character.isLetterOrDigit(end)) {
                e--;
            }
            else if (start == end) {
                s++;
                e--;
            } 
            else {
                return false;
            }
        }
        return true;
    }
}