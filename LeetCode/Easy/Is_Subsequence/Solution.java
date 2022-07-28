class Solution {
    public boolean isSubsequence(String s, String t) {
        String[] s_input = s.split("");
        String[] t_input = t.split("");
        int index = 0;
        int check = 0;
        if (s.length() > t.length())
           return false;
        else{
            for(int i = 0; i < s.length(); i++){
            check = 0;
                for(int j = index; j < t.length(); j++){
                    if (s.charAt(i) == t.charAt(j)){
                        index = j+1;
                        check = 1;
                        break;
                    }
                }
                if(check == 0)
                	return false;
                else
                    continue;
            }
        }
        return true;
    }
}
