package String;

public class Reverse {

	public static void main(String[] args) {
		char[] s = {'a','b','c','d','e', 'f'};

	      int left = 0, right = s.length-1;
	        
	        while(left < right){
	            char temp = s[left];
	            s[left] = s[right];
	            s[right] = temp;
	            
	            left++;
	            right--;
	        }
	        
	        for (int i = 0; i < s.length; i++) {
	        	System.out.print(s[i]);
				
			}
	        
	}

}
