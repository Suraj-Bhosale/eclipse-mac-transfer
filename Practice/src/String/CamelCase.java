package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CamelCase {

	public static void main(String[] args) {
		
      	Scanner scan = new Scanner(System.in);
        String str = scan.next();
       int upperCase = 0;
       for(int i = 0; i < str.length(); i++){
         char x = str.charAt(i);
         if(x > 'A' && x < 'Z'){
           upperCase++;
         }
       }
      System.out.print(upperCase+1);
	}

}
