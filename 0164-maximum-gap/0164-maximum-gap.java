class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        if(nums.length < 2){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            int max = nums[i] - nums[i-1];

            count = Math.max(count, max);
        }
        return count;
        
    }
}