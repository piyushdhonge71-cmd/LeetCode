class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;


        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i] = n;
            }
            else{
                right[i] = stack.peek();
            }
            stack.push(i);
        }


        while(!stack.isEmpty()){
            stack.pop();
        }


        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = stack.peek();
            }
            stack.push(i);
        }


        for(int i=0; i<n; i++){
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            ans = Math.max(ans,area);
        }
        return ans;
        
    }
}