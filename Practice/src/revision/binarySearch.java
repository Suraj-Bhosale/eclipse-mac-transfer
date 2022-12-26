package revision;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 7;
		int first = firstOccurance(arr,target);
		int last = LastOccurance(arr,target);
        System.out.print(first+ " "+ last);
	}

	private static int firstOccurance(int[] arr, int target) {
		
		int s = 0;
		int e = arr.length - 1;
		int mid = s + (e - s)/2;
		int ans = -1;
		while(s <= e) {
			if(arr[mid] == target) {
                ans = mid;
				e = mid - 1;
            }
			

			
			if(target < arr[mid]) {
				e = mid - 1;
			}
			
			else if(target > arr[mid]) {
				s = mid + 1;
			}
			
			mid = s + (e - s)/2;
		}

      return ans;
	}
	
	private static int LastOccurance(int[] arr, int target) {
		
		int s = 0;
		int e = arr.length - 1;
		int mid = s + (e - s)/2;
		int ans = -1;
		while(s <= e) {
			if(arr[mid] == target) {
                ans = mid;
				s = mid + 1;
	
			}
			
			if(arr[mid] < target  && arr.length == 1) {
				ans = mid + 1;
				return ans;
			}
			
			if(target < arr[mid]) {
				e = mid - 1;
			}
			
			else if(target > arr[mid]) {
				s = mid + 1;
			}
			
			mid = s + (e - s)/2;
		}

      return ans;
	}

}
