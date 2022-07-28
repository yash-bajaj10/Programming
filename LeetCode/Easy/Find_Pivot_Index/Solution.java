class Solution {
    public int pivotIndex(int[] nums) {
        int index = 0;
        int check = 0;
        int length = nums.length;
        int Left = 0;
        int Right = 0;
        for (index = 0; index < length; index++){
            
            Left = LeftSum(nums,index, length);
            Right = RightSum(nums,index,length);
            if (Left == Right){
                check = 1;
                break;
            }
            else 
                continue;
        }
        if (check == 0)
            return -1;
        else
            return index;
    }
    static int LeftSum(int[] nums,int index,int length){
        int sum = 0;
        for (int i = 0; i < index; i++){
            sum = nums[i] + sum;
        }
        return sum;
    }
    static int RightSum(int[] nums,int index,int length){
         int sum = 0;
        for (int i = length -1; i > index; i--){
            sum = nums[i] + sum;
        }
        return sum;
    }
}
