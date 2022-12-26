package bubbleSort;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
	     
           //int n = 7;
           int[] arr = {2,1,3,1,2};
           int count = 0;
          // bubbleSort(arr,n);
           int n = arr.length;
   		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n- i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					count++;
					int temp = arr[j];
					 arr[j] = arr[j + 1];
					 arr[j + 1] = temp;
				}
			}
		}
   		
//   		for(int i = 0; i < n-1; i++) {
//			System.out.print(arr[i]+" ");
//		}
   		
   		System.out.println("Array is sorted in "+count+" swaps");
   		System.out.println("First Element: "+ arr[0]);
   		System.out.println("Last Element: "+ arr[arr.length - 1]);
   		
          // printArr(arr,arr.length);

	}

	private static void bubbleSort(int[] arr, int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[i] > arr[i+1]) {
					
					int temp = arr[i];
					 arr[i] = arr[i+1];
					 arr[i+1] = temp;
				}
			}
		}
		
	}

	private static void printArr(int[] arr, int n) {
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}

}
