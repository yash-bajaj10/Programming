class Solution {
    public int search(int[] nums, int target) {
        int check = 0, index = 0;
        for(int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                check = 1;
                index = i;
                break;
            }
            else
                continue;
        }
        if(check == 1)
            return index;
        else
            return -1;
    }
}
