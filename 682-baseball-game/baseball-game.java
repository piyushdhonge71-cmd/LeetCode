class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i=0; i<operations.length; i++){
            String ch = operations[i];
            
            if(ch.equals("C")){
                stack.pop();
                
            }
            else if(ch.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(ch.equals("+")){
                stack.push(stack.peek()+stack.get(stack.size()-2));
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        for(int i=0; i<stack.size(); i++){
            ans = ans + stack.get(i);
        }
        return ans;
        
    }
}