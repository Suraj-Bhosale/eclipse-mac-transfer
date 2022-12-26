package mergeSort;

public class Basic {

	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2,9,7,6};
		int n = arr.length;
		
		mergeSort(arr,0,n-1);
		
		for(int p: arr) {
			System.out.print(p+" ");
		}

	}

	private static void mergeSort(int[] arr, int s, int e) {
		if(s>=e) {
			return;
		}
		
		int mid = s + (e - s)/2;
		mergeSort(arr,s,mid);
		mergeSort(arr,mid + 1,e);
		conquoir(arr,s,mid,e);
		
	}

	private static void conquoir(int[] arr, int s, int mid, int e) {
		int[] mergeIt = new int[e - s + 1];
		int x = 0;
		
		int idx1 = s;
		int idx2 = mid + 1;
		while(idx1 <= mid  &&  idx2 <= e) {
			
			if(arr[idx1] <= arr[idx2]) {
				mergeIt[x++] = arr[idx1++];
			}
			else {
				mergeIt[x++] = arr[idx2++];
			}
		}
		
		while(idx1 <= mid ) {
	      mergeIt[x++] = arr[idx1++];
        }
		
		while(idx2 <= e) {
	      mergeIt[x++] = arr[idx2++];
        }
		

		for(int i = 0, j = s; i<mergeIt.length; i++, j++) {
			arr[j] = mergeIt[i];
		}
	}

}
