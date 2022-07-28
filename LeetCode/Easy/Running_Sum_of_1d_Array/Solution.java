class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for(int i=0; i < length; i++){
            sum = nums[i] + sum;
            nums[i] = sum;
        }
        return nums;
    }
}
