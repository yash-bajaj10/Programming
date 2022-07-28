class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int counter = 0;
        int ans = 0;
        int first_index = 0;
        int second_index = 1;
        while(counter < nums.length){
            for (int i = counter + 1; i < nums.length; i++){
                ans = nums[counter] + nums[i];
                if(ans == target){
                    
                    output[first_index] = counter;
                    output[second_index] = i;
                  
                    break;
                }
            }
            counter = counter + 1;
            if(ans == target)
                break;
        }
        return output;
    }
}
