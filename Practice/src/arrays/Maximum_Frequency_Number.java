package arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Maximum_Frequency_Number
{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//
//       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//          int[] arr = {1,2,3,3,3,3,4,4,4,5};
//          int n = arr.length;
//         for(int j= 0; j < n; j++){
//           map.put(arr[j],map.getOrDefault(arr[j], 0) + 1);
//
//         }
//
//          int max= Integer.MIN_VALUE;
//          int value = 0;
//         
//        for( Map.Entry<Integer, Integer> entry : map.entrySet()){
//               int a = entry.getKey();
//               int b = entry.getValue();
//             if(b > max){
//               max = b;
//               value = a;
//             }
//         }
//
//         System.out.print(value+" ");
//       }
	
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

       int i = 0;
       HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
       
       while(i < t){
         int n = scan.nextInt();

       
          int[] arr = new int[n];
          
         for(int j= 0; j < n; j++){
           arr[j] = scan.nextInt();
         }
         
         for(int j= 0; j < n; j++){
           map.put(arr[j],map.getOrDefault(arr[j], 0) + 1);

         }

          int max= Integer.MIN_VALUE;
          int value = arr[0];
         
        for( Map.Entry<Integer, Integer> entry : map.entrySet()){
               int a = entry.getKey();
               int b = entry.getValue();
            if(b > 1) {   
             if(b > max){
               max = b;
               value = a;
             }
            }
         }

         System.out.print(value+" ");


         i++;
         map.clear();

            for(int j= 0; j < arr.length; j++){
            arr[j] = 0;
          }
           
        }
         
       }
	}
