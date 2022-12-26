package String;
import java.util.*;
import java.util.regex.Pattern;
import java.lang.*;
import java.io.*;

public class reverse_word {

	 public static String reverseWords(String str)
	    {
	  
	        // Specifying the pattern to be searched
	        Pattern pattern = Pattern.compile(".");
	  
	        // splitting String str with a pattern
	        // (i.e )splitting the string whenever their
	        //  is whitespace and store in temp array.
	        String[] temp = pattern.split(str);
	        String result = "";
	 
	       
	        // Iterate over the temp array and store
	        // the string in reverse order.
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1) {
	                result = temp[i] + result;
	                System.out.print(result);
	            }
	            else {
	                result = " " + temp[i] + result;
	            System.out.print(result);
	            }
	        }
	        return result;
	    }
	  
	    // Driver methods to test above method
	    public static void main(String[] args)
	    {
	        String s1 = "one.two";
	     System.out.println(reverseWords(s1));
	
	  
	
	    }

}
