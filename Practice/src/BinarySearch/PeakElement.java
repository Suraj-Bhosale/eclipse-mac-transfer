package BinarySearch;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
       int[] arr = {1,2,4,5,2,3};
       int size = arr.length;
       int ans =pealMountain(arr,size);
        System.out.println(ans);

	}

	private static int pealMountain(int[] arr, int size) {
	
		int s = 0;
		int e = size - 1;
		int m = s + (e - s)/2;
		
		while(s < e) {
			if(arr[m] < arr[m+1]) {
				s = m + 1;
				
			}else {
				e = m;
			}
			
			m = s + (e - s)/2;
		}
		
		return s;
		
	}

}
