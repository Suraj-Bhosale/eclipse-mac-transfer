package random;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Books {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no_of_books = scan.nextInt();
		int time = scan.nextInt();
		
        int[] arr = new int[no_of_books];
        for(int i = 0; i<no_of_books; i++) {
        	arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i<no_of_books; i++) {
        	sum += arr[i];
        	if(sum <= time) {
        		count++;
        	}
        	
        	
        	
        }
        
        System.out.print(count);
        

        
        //--------------------
        
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int timeAlloted = sc.nextInt();
//        int A[] = new int[n];
//
//        for(int i=0; i<n; i++){
//            A[i] = sc.nextInt();
//        }
//
//        int maxBookCount = 0;
//
//        for(int i=0; i<n; i++){
//          int timeTaken = 0;
//          int bookCount = 0;
//          for(int index=i;index<n;index++){
//            timeTaken = timeTaken + A[index];
//            if(timeTaken<=timeAlloted){
//                bookCount++;
//            }
//            else{
//              break;
//            }
//          maxBookCount = Math.max(maxBookCount, bookCount);
//        }
//     }
//        System.out.println(maxBookCount);

	}

}
