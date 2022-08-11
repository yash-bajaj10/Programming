class Solution {
    public void sortColors(int[] nums) {
        int max = 0;
        int temp = 0;
        int check = 1;
        while (check == 1){
            for (int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i-1]){
                    temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                    check = 0;
                }
            }
            if(check == 0)
                check = 1;
            else
                check = 0;
        }
    }
}
