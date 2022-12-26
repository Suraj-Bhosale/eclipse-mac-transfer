package Recursion;

import java.util.Scanner;

public class Xish {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String xString = scan.next();
        int wordLength = word.length();
        int xStringLength = xString.length();
        int count = 0;
//
      	int ans = xish(word,xString,0);
//        	//System.out.println(ans);
//            
//	 //   }
       if(ans >=  xString.length()) {
       	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
//		
//		if("awesome".contains("woe")) {
//        	System.out.println("true");
//        }
//        else {
//        	System.out.println("false");
//        }
//		
//		String name = "woe";
//		System.out.println(name.substring(2, 3));

}

	static int xish(String check, String letters, int xishCount) {

	    if(letters.length() < 1) {
	        return 0;
	    }

	    if(check.contains(letters.substring(0, 1))) {
	        xishCount = 1;
	    }

	    return  xishCount + xish(check, letters.substring(1, letters.length()), 0);
	}
}
