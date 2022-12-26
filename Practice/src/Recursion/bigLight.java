package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class bigLight {

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class Main
	{
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner scan = new Scanner(System.in);
	        int h1 = scan.nextInt();
	        int h2 = scan.nextInt();
	        int v1 = scan.nextInt();
	        int v2 = scan.nextInt();
	      
	        int count = 0;
	      for(int i = h1; i < 10000; i++){
	           for(int j = h2; j < 10000; j++){
	             
	                if(h1 == h2){
	                  count++;
	                }

	             h1 = h1 + v1;
	            h2 = h2 + v2;
	           }
	      }

	                if(count > 0){
	                  System.out.print("true");
	                }
	                 else{
	                   System.out.print("false");
	                 }
	      
		}
	}
}
