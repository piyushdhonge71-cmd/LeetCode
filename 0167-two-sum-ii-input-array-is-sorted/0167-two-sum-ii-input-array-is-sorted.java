class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int sum = 0;

        while(s < e){
            sum = numbers[s] + numbers[e];
            if(sum == target){
                return new int[]{s+1,e+1};
            }
            else if(sum < target){
                s++;
            }
            else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
}