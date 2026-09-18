class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        for(int i=nums1.length-1; i>=0; i--){
            Stack<Integer> stack = new Stack<>();
            for(int j=nums2.length-1; j>=0; j--){
                if(nums1[i] == nums2[j]){
                    while(!stack.isEmpty() && stack.peek() <= nums2[j]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        ans[i] = -1;
                    }
                    else{
                        ans[i] = stack.peek();                       
                    }
                    break;

                }
                stack.push(nums2[j]);
            }
        }
        return ans;
        
    }
}