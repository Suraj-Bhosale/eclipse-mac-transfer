package hash;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Fun_with_numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int t = scan.nextInt();

        int[] arr = new int[no];
        for(int i = 0; i < no; i++){
          arr[i] = scan.nextInt();
        }

  
       while(t > 0){
    	      int temp = 1;
    	        int rounds = 1;
    	        int count = 0;
           int a = scan.nextInt();
           int b = scan.nextInt();
           swap(arr, a -1, b -1);
           findRounds(arr, no, temp, rounds, count);
         t--;
       }

      
	}

   public static void swap(int[] arr,int a, int b){
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

   public static void findRounds(int[] arr, int no, int temp, int rounds,int count){
            while(rounds<no){
               for(int i = 0; i < no; i++){
            	   
            	   
                 if(arr[i] == temp){
                    count++;
                    temp++;
                 }
              
               }
            if(count == no){
              break;
            }
            rounds++;
          }
    
          System.out.println(rounds);
   }
}