package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class KAnagrams {

	public static void main (String[] args) throws java.lang.Exception
	{
//		Scanner scan = new Scanner(System.in);
//        int k = scan.nextInt();
//        String str = scan.next();
//        String str2 = scan.next();
   
     // System.out.print(kAnagramChecker(str,str2,k) ? 1 : 0);
      
      
      
       String str = "ABC";
       System.out.println(str.toLowerCase());
       
//       for(int i = 0; i < str.length(); i++){
//    	   int x = str.charAt(i) - 'a';
//           System.out.print(x);
//      
//          }
//          
    }

    static int MAX_CHAR = 26;
    public static boolean kAnagramChecker(String str, String str2, int k){

      int n = str.length();
      int str2Length = str2.length();
      if(n != str2Length){
        return false;
      }

      int[] count1 = new int[MAX_CHAR];
      int[] count2 = new int[MAX_CHAR];

      int count = 0;

      for(int i = 0; i < n; i++){
        count1[str.charAt(i) - 'a']++;
      }
      
      for(int i = 0; i < n; i++){
       count2[str2.charAt(i) - 'a']++;
  
      }
      
      for(int i = 0; i < n; i++){
          System.out.println("Count1 array is: "+count1[i]);
          System.out.println("Count2 array is: "+count2[i]);
        }
      
      for(int i = 0; i < MAX_CHAR; i++){
         if(count1[i] > count2[i]) {
        	 System.out.print("Count1 is: "+count1[i]+" Count2 is: " + count2[i]);
        	 System.out.print("Math is "+Math.abs(count1[i] - count2[i]));
        	 count = count + Math.abs(count1[i] - count2[i]);
        	 System.out.println("Total count is "+ count);
         }
      }
      
      
	 return (count <= k);
    }
}
