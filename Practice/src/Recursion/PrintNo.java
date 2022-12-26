package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNo {

	public static void main (String[] args) throws java.lang.Exception
	{
		int sum = 0;
		Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        
        
        
      while(testCase != 0) {
    	       int i = 1;
               int no = scan.nextInt();
         	   int[] arr = new int[no];
         	   
         	   for(int j = 0; j<no; j++) {
         		   arr[j] = scan.nextInt();
         	   }
               
         	   helloRecursion(no,testCase,i,sum,arr);
         	  testCase--;  
            	  // System.out.println("Case "+i+": "+sum);
           }
//       int l = 1; 
// 	  while(l <= testCase) {
// 	  System.out.println("Case "+ l + ": "+cap.get(l-1).toString().replace("[","").replace(",","").replace("]",""));
// 	  l++;
// 	  }
 	  
       
 
	}

   public static void helloRecursion(int no,int testCase,int i,int sum,int[]arr){
    
      // while(i <= testCase) {
	  
       if(i == testCase) {
    	   
    	   return;
       }
       for(int j = 0; j<no; j++) {
       sum = sum + arr[j];
       }
      // 
    
       System.out.print("Case "+ i + ": "+sum);
       	helloRecursion(no,testCase,i+1,sum,arr);
    	  // i++;
      
     
   // return sum;
     
   }

}
