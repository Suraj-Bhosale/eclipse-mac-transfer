package BinarySearch;

import java.util.*;
import java.lang.*;
import java.io.*;


public class FirstAndLastPosition {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        
        while(testCase > 0) {
        	
        	
        	 int no = scan.nextInt();
        	 int target = scan.nextInt();
        	 int[] arr = new int[no];
        	 
        	 for(int i = 0; i < no; i++) {
        		 arr[i] = scan.nextInt();
        	 }
        	
        	int first = firstOccurance(no,target,arr);
        	System.out.print(first+" ");
        	int last = lastOccurance(no,target,arr);
        	System.out.print(last);
        	testCase--;
        }
       

	}

	private static int firstOccurance(int no, int target, int[] arr) {
		
		int start = 0;
		int end = no-1;
		int mid = (start + end)/2;
		int ans = -1;
		while(start <= end) {
			
			if(target == arr[mid]) {
				ans = mid;
				end = mid - 1;
			}
			
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else if (target < arr[mid]){
				end = mid - 1;
			}
			mid = (start + end)/2;
			
		}
		return ans;
		
	}
	
	private static int lastOccurance(int no, int target, int[] arr) {
		
		int start = 0;
		int end = no-1;
		int mid = (start + end)/2;
		int ans = -1;
		while(start <= end) {
			
			if(target == arr[mid]) {
				ans = mid;
				start = mid + 1;
			}
			
			else if(target < arr[mid]) {
				start = mid + 1;
			}
			else if (target > arr[mid]){
				end = mid - 1;
			}
			
			mid = (start + end)/2;
			
		}
		return ans;
		
	}

}
