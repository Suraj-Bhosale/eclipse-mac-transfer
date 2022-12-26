package stack;

public class SubarrayMinimum {

	public static void main(String[] args) {
		int[] arr = {11 ,81, 94, 43, 3};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			int j = i + 1;
			
			if(j <= arr.length-1) {
			if(arr[i] > arr[j]) {
				sum += arr[j];
			}
			else {
				sum += arr[i];
			}
			}
		}
		
		System.out.println(sum);

	}

}
