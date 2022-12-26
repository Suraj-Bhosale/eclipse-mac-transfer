package BinarySearch;

import java.util.Scanner;

public class AllocateBooks {

	public static void main(String[] args) {
		
	     Scanner scan = new Scanner(System.in);
	     int no_of_books = scan.nextInt();
	     int no_of_students = scan.nextInt();
	     
	     int[] arr = new int[no_of_books];
	        for(int i = 0; i<no_of_books; i++) {
	        	arr[i] = scan.nextInt();
	        }
	        
	        int ans = allocationLogic(arr,no_of_books,no_of_students);
	        System.out.println(ans);

	}
	
	public static boolean isPossible(int[] arr, int no_of_books, int no_of_students, int mid) {
		int studentCount = 1;
		int pagesSum = 0;
		
		for(int i = 0; i<no_of_books; i++) {
		   
			if(pagesSum + arr[i] <= mid) {
				pagesSum += arr[i];
			}
			
			else {
				studentCount++;
				if(studentCount > no_of_students || arr[i] > mid) {
					return  false;
				}
				pagesSum = arr[i];
			}
		}
		
		return true;
		
	}

	private static int allocationLogic(int[] arr, int no_of_books, int no_of_students) {
        int s = 0;
        int sum = 0;
        for(int i = 0; i<no_of_books; i++) {
        	sum += arr[i];
        }
        
        int e = sum;
        int mid = s + (e - s)/2;
        
        int ans = -1;
        while(s<=e) {
        	
        	if(isPossible(arr,no_of_books,no_of_students,mid)) {
        		ans = mid;
        		e = mid -1;
        	}
        	else {
        		s = mid +1;
        	}
        	mid = s + (e - s)/2;
        }
		return ans;
	}

}
