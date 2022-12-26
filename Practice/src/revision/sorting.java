package revision;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int[] arr = {0,8,7,6,5,4,3,2,10};
		int n = arr.length;
		int k = 2;
		 divide(arr,0,n-1);
		//System.out.println(ans);
		 printArray(arr);
	}
	
 
	static void divide(int[] arr, int s, int e)
	{

	     if(s>=e) {
	    	 return;
	     }
	     
	     int mid = s + (e - s)/2;
	     divide(arr,s,mid);
	     divide(arr,mid +1, e);
	     conquiour(arr,s,mid,e);
	  
	}
	
	private static void conquiour(int[] arr, int s, int mid, int e) {
		int[] merge = new int[e -s +1];
		int indx1 = s;
		int indx2 = mid +1;
		int x = 0;
		
		while(indx1 <= mid && indx2 <= e) {
			if(arr[indx1] <= arr[indx2]) {
				merge[x++] = arr[indx1++];
			}
			else {
				merge[x++] = arr[indx2++];
			}
		}
		
		while(indx1 <= mid ) {
			merge[x++] = arr[indx1++];
		}
		
		while( indx2 <= e) {
			merge[x++] = arr[indx2++];
		}
		
		
		for(int i = 0, j = s; i < merge.length; i++, j++) {
			arr[j] = merge[i];
		}
	}


	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp =  arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}

}
