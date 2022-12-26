package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class HelloRcur
{
	public static void main (String[] args) throws java.lang.Exception
  {     
        int sum = 0;
		Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        
        int i = 0;
        
      while(testCase > 0) {
        
               int no = scan.nextInt();
         	   int[] arr = new int[2*no];
         	   
         	   for(int j = 0; j<no; j++) {
         		   arr[j] = scan.nextInt();
         	   }
               
         	   helloRecursion(no,testCase,0,0,arr);
            	   
        }
	}

   public static void helloRecursion(int no,int testCase,int i,int sum,int[]arr){
    
      // while(i <= testCase) {
	  
       if(i == no) {
    	   sum = sum + arr[i];
    	   System.out.println(sum);
    	   return;
       }
     //  for(int j = 0; j<no; j++) {
       sum = sum + arr[i];
          helloRecursion(no,testCase,i+1,sum,arr);

     }

}
