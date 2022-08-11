/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution{
	public static boolean isBadVersion(int n){
		if (n >= 13)
			return true;
		return false;
	}
    public static int check(int first,int mid,int last){
        
        int index = 0;
        boolean output = false;
        
        while(mid > 0){        
        	output = isBadVersion(mid);
	        System.out.println("first : " + first +" mid : "+ mid +" last :" + last +" output : " + output);
        	if (output == false){
        		if (mid == first){
                	System.out.println("sfirstif " + mid);
                	return last;
		        }
                	
		        else{
		        	first = mid;
		            mid = (mid + last)/2;
		            last = last;   
		        }
        	}
        	else{
           	System.out.println("efirstif " + mid);
		        if ((mid == last) || (mid == first))
		            return mid;
		        else{
		        	first = first;
		        	last = mid;
		            mid = (first + mid)/2;
		            
        	    }
        	}
        }
        return 0;
    }
    public static int firstBadVersion(int n) {
        int mid_point = (n+1)/2;
        int result;
        result = check(1,mid_point,n);
        System.out.println("result : " + result);
        return result;
    }
    public static void main(String args[]){
    	int n = 35;
    	int output = 0;
    	output = firstBadVersion(n);
    	System.out.println(output);
    }
}
