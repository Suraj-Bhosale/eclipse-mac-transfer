package BinarySearch;

public class Intro {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int leng = arr.length;
		int target = 1;
		
		int ans = binarySearch(arr,leng,target);
        System.out.println("Index is:"+ ans);
	}

	private static int binarySearch(int[] arr, int leng, int target) {
		
		int start = 0;
		int end = leng - 1;
		int mid = (start + end)/2;
		
		while(start <= end) {
			
			if(arr[mid] == target) {
				return mid;
			}
			
//			if(arr[0] == target) {
//				return 0;
//			}
			
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
			 mid = (start + end)/2;
		}
		return -1;
	}

}
