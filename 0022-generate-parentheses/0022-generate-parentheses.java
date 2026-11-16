class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        generate(result,"",n,n);
        return result;
    }
    void generate(ArrayList<String> result,String str, int left, int right){
        if(left == 0 && right == 0){
            result.add(str);
            return;
        }
        if(left > 0){
            generate(result,str+'(',left-1,right);
        }
        if(right > left){
            generate(result,str+')',left,right-1);
        }
    }
}