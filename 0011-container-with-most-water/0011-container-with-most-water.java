class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;
        while(left <= right){
            int minlen = Math.min(height[left],height[right]);
            int width = right - left;
            int area = minlen * width;

            maxarea = Math.max(maxarea,area);
            

            if(height[right] < height[left]){
                right--;
            }else{
                left++;
            }
        }
        return maxarea;
    }
}