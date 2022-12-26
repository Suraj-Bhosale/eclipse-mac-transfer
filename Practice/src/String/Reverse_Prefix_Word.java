package String;

public class Reverse_Prefix_Word {

	public static void main(String[] args) {
		String word = "abcdefg";
		char x = 'd';


	
		System.out.print(reversePre(word,x));
		

	        
	}

	private static String reversePre(String word, char x) {
		 char[] s = word.toCharArray();
	      int left = 0, right = word.indexOf(x);
	        
	        while(left < right){
	            char temp = s[left];
	            s[left] = s[right];
	            s[right] = temp;
	            
	            left++;
	            right--;
	        }
	        String newW = "";
	        for (int i = 0; i < s.length; i++) {
	        	newW += s[i];
				
			}
			return newW;
		
	}
	
	//Optimization
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
            int n = word.length();
            int index = word.indexOf(ch);
            for(int i=index;i>=0;i--)
                sb.append(word.charAt(i));
                sb.append(word,index+1,n);
            String ans = sb.toString();
        return ans;
    }

}
