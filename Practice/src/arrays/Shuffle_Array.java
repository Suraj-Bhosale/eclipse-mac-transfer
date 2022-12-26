package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Shuffle_Array {
//https://leetcode.com/problems/shuffle-the-array/
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,1,3,4,7};//[2,3,5,4,1,7] 
		int n = 3;
		
		int[] temp = new int[arr.length];
		int x = 0;
		
			
			int i = 0;
			for (int j = 0; j < temp.length; j++) {
				temp[j] = arr[i];
				j++;
				i++;
				
			}
		
			 i = n;
			for (int j = 1; j < temp.length; j++) {
				temp[j] = arr[i];
				j++;
				i++;
				
			}


	for (int m = 0; m < temp.length; m++) {
		System.out.print(temp[m]);
		
	}
	
	//Optimization
//	       int[] ans = new int[2*n];
//           int j = 0;
//           for(int i = 0 ; i < 2*n; i += 2){
//                   ans[i] = arr[j];
//                   ans[i+1] = arr[j+n];
//                   j++;
//           }
//           return ans;

}
