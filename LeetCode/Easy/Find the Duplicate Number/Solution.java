class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                output = nums[i];
                break;
            }    
            else 
                continue;
        }
        return output;
    }
}
