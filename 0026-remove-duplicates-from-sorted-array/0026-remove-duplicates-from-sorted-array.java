class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i = i+1;
                swap(nums, i, j);
            }
        }
        return i+1;
        
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}