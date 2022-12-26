package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class sort_string_desc_order {

	public static void main (String[] args) throws java.lang.Exception
	{
//     	Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        sortStrDec(str);
		
		String ans = getCharForNumber(27);
//		if(ans == null) {
//			ans = "a";
//			System.out.print(ans);
//		}
//		else {
//			System.out.print(ans);
//		}
		System.out.print(ans);

	}
	
	private static String getCharForNumber(int i) {
	    return i >= 0 && i < 27 ? String.valueOf((char)(i + 96)) : null;
	}

   public static void sortStrDec(String str){
     int[] arr = new int[str.length()];
     String[] temp = new String[str.length()];
    
     for(int i = 0; i < str.length(); i++){
       arr[i]= (str.charAt(i) - 'a');
     }

     Arrays.sort(arr);
     
     for(int i = arr.length-1; i >= 0; i--){
    
 		String ans = getCharForNumber(arr[i]);
 		if(ans == null) {
 			ans = "a";
 			System.out.print(ans);
 		}
 		else {
 			System.out.print(ans);
 		}
       }
    
   }

}
