package BinarySearch;

public class Pivote {

	public static void main(String[] args) {
	       int[] arr = {7,9,1,2,3,4};
	       int size = arr.length;
	       int ans =pivoteElement(arr,size);
	        System.out.println(ans);

	}

	private static int pivoteElement(int[] arr, int size) {
	
		
		int s = 0;
		int e = size - 1;
		int m = s + (e - s)/2;
		int ans = -1;
		while(s < e) {
			if(arr[m] >= arr[0]) {
				s = m + 1;
				
			}else {
				e = m;
			}
			
			m = s + (e - s)/2;
		}
		
		return s;
		
	}

}
