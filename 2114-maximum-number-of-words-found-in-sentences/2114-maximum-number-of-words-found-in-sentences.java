class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            int count = 0;
            String str = sentences[i];
            for(int j=0; j<str.length(); j++){
                char ch = ' ';
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            max = Math.max(max, count);

        }
        
        return max+1;
        
    }
}