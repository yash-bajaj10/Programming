class Solution {
    public boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int j = input.length();
        int result = 0;
        for (int i = 0; i < (input.length()/2)+1; i++){
            if (input.charAt(i) == input.charAt(j-1))
                result = 1;
            else{
                result = 0;
                break;
            }
            j = j - 1;
        }
        if (result == 1)
            return true;
        else
            return false;
    }
}
