package String;

import java.util.LinkedList;

public class removeAdjacents {

	public static void main(String[] args) {
		String str = "caaabbbaacdddd";
		//abcddcba -> abccba -> abba -> aa -> (empty string)
        int n = str.length();
      //  LinkedList<Character> list = new LinkedList<Character>();
     
        
        
        removeDublicateRecursion(str);

	}
	  static String ans = "";
	  static String result = "";
	  static int count = 0;
	private static void removeDublicateRecursion(String str) {
		if(str.length() == 0) {
			System.out.print("Ans is:"+ans);
			return;
		}
        while(str.length() > 0) {
        	if(str.length() == 1) {
              	ans += str.charAt(0);
	        	str = str.substring(1,str.length());
	        	result = ans;
	        //	System.out.print("Ans is:"+ans);
	        	ans = "";
	        	//return;
	        	break;
        	}
        	
        	else if(str.charAt(0) == str.charAt(1) && str.charAt(2) == str.charAt(3) && str.charAt(0) == str.charAt(2)) {
                if(str.length() == 4) {
                	result = "";
                }
               str = str.substring(4,str.length());
     
	        }
        	
        	else if(str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)) {
                if(str.length() == 3) {
                	result = "";
                }
               str = str.substring(3,str.length());
     
	        }
        	

        	
        	else if(str.charAt(0) == str.charAt(1)) {
                if(str.length() == 2) {
                	result = "";
                }
               str = str.substring(2,str.length());
     
	        }
        	

	        else {
	        	ans += str.charAt(0);
	        	count++;
	        	str = str.substring(1,str.length());
	        }
        }
    //System.out.println("Result is :"+result);
        removeDublicateRecursion(result);
		
	}

}
