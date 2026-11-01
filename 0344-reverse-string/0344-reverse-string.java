class Solution {
    public void reverseString(char[] s) {
            reverse(s,0,s.length-1);
               
    }
    void reverse(char[] s,int st, int e){
        if(st >= e){
            return;
        }
        swap(s,st,e);
        reverse(s,st+1,e-1);
    }
    void swap(char[] s, int a, int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}