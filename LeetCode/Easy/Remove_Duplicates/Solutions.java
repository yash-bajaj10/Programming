class Solution {
    public int removeDuplicates(int[] nums) {
        int max = nums[0];
        int index = 1;
        
        // variable 'index' repesent 'k'
        // max stores the element and is used for duplicate check
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != max){
                max = nums[i];
                nums[index] = nums[i];
                index = index + 1;
            }
        }
        return index;
        
    }
}
