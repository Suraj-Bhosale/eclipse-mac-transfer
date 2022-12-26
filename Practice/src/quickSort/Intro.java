package quickSort;

public class Intro {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int size = arr.length;
		
		quickSort(arr,0,size-1);
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
        	int pivdx = pivotPosition(arr,low,high);
        	quickSort(arr,low, pivdx - 1);
        	quickSort(arr,pivdx + 1 , high);
        }
		
	}

	private static int pivotPosition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}

}
