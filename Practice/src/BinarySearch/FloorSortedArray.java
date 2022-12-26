package BinarySearch;

import java.util.Scanner;

public class FloorSortedArray {

	public static void main(String[] args) {
         //Scanner scan = new Scanner(System.in);
	   	 int no = 7;
	   	 int target = 9;
	   	 int[] arr = {1,2,8,10,11,12,19};
	   	 
//	   	 for(int i = 0; i < no; i++) {
//	   		 arr[i] = scan.nextInt();
//	   	 }
	   	 
	   	 int ans = floorSorted(no,target,arr);
	   	 if(ans == 0) {
	   		 ans = -1;
	       
	   	 }
	   	 System.out.println(ans);

	}

	private static int floorSorted(int no, int target, int[] arr) {
		int start = 0;
		int end = no-1;
		int mid = (start + end)/2;
		int ans = -1;
		while(start <= end) {
			if(target == arr[mid]) {
			    return mid;
			}
			
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else if (target < arr[mid]){
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		
		return mid;
    }

}
