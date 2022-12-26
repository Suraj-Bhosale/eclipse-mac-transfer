package Recursion;

import java.util.Scanner;

public class PermutationOfString {

	   public static void printPermutn(String str, String ans)
	    {
	 
	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            // ith character of str
	            char ch = str.charAt(i);
	 
	            // Rest of the string after excluding
	            // the ith character
	            String first = str.substring(0, i);
	            System.out.print(first);
	            String second = str.substring(i + 1);
	            System.out.print(second);
	            String ros = first + second;
	            System.out.print(ros);
	 
	            // Recursive call
	            printPermutn(ros, ans + ch);
	        }
	    }
	 
	
	    public static void main(String[] args)
	    {
			//Scanner scan = new Scanner(System.in);
	        String s = "ABC";
	
	        printPermutn(s, "");
	    }
}
