package String;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

public class Dates {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        
//        int t = scan.nextInt();
//
//        Pattern pt = Pattern.compile("\\.");
//
//        while(t != 0){
//          String str = scan.next();
//          String[] arr = pt.split(str);
//          
//          
//          if(Integer.valueOf(arr[0]) <= 9 || Integer.valueOf(arr[1]) <= 9 || Integer.valueOf(arr[2]) <= 9 ) {
//        	  arr[0] = 0 +arr[0];
//          }
//          else {
//          System.out.print(arr[0]+"."+arr[1]+"."+arr[2]+" ");
//          System.out.print(arr[1]+"/"+arr[0]+"/"+arr[2]+" ");
//          }
//          t--;
//        }
//
//	}
	
	public static void main (String[] args) throws java.lang.Exception
	{		 
        // Scanner  scan = new Scanner(System.in);
          int str = 123;

         // logic(str);
          System.out.print( logic(str)+" ");
	}
	static int sum = 0;
			static int logic(int n ) {
				
				if(n == 0) {
					return 0;
				
				}
				int x = n%10;;
				logic(n/10);
				sum += x;
	              return sum;
			}

}
