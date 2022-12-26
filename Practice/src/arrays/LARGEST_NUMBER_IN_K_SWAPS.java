package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LARGEST_NUMBER_IN_K_SWAPS {

	public static void main(String[] args) {
		String str = "7462781883711";  //7755511124
		int k = 5;    //7654   
		int no = str.length();
		int[] arr = new int[no];
		for(int i = 0; i < no; i++) {
			arr[i] = str.charAt(i) - 48;
		}

			
			for(int i = 0; i < k; i++) {
				int max = Integer.MIN_VALUE;
				int maxIndx = 0;
				for(int m = i; m < no; m++) {
				    if(arr[m] > max) {
				    	max = arr[m];
				    	maxIndx = m;
				    }

				}
				
				if(arr[i] <= arr[maxIndx]) {
					swap(arr,i,maxIndx);
				
					
				}
				else {
					break;
				}
		    }

		 String ans = null;
		for(int i = 0; i < no; i++) {
		      ans = String.valueOf(arr[i]);
		   	System.out.print(ans);
		}
		
	

	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
