package BinarySearch;

public class Minimum_Num_in_Sorted_Rotated_Array {

	public static void main(String[] args) {
		 int arr1[] = {1,2,3,0,-1,-2};
		    int n1 = arr1.length;
		    System.out.println("The minimum element is " +
		                       findMin(arr1, 0, n1 - 1));
	}

	
	// Function to find minimum element
	public static int findMin(int arr[],
	                          int low, int high)
	{
	    while(low < high)
	    {
	        int mid = low + (high - low) / 2;
	        if (arr[mid] == arr[high])
	            high--;
	             
	        else if(arr[mid] > arr[high])
	            low = mid + 1;
	        else
	            high = mid;
	    }
	    return arr[high];
	}
}
