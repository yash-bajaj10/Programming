class Alternate_Solution {
    public void sortColors(int[] nums) {
           
        int Total_Zeroes = 0;
        int Total_Ones = 0;
        int Total_Twos = 0;
        
        //Counting total number of 0's,1's,2's
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                Total_Zeroes = Total_Zeroes + 1;
            else if(nums[i] == 1)
                Total_Ones = Total_Ones + 1;
            else
                Total_Twos = Total_Twos + 1;
        }
        
        //Putting 0's,1's,2,s in array
        
        for(int j = 0; j < nums.length; j++){
            if(j < Total_Zeroes)  
                nums[j] = 0;
            else if(j >= Total_Zeroes && j < Total_Zeroes + Total_Ones)
                nums[j] = 1;
            else
                nums[j] = 2;
        }
    }
}
