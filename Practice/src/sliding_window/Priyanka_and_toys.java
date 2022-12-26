package sliding_window;

import java.util.Arrays;

public class Priyanka_and_toys {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 21, 7, 12, 14 ,21};
		int n = arr.length;
		Arrays.sort(arr);
		int i = 0, j = 0, count = 0,sum = Integer.MIN_VALUE;
		int k = arr[0];

		
		for(int h: arr) {
			if(!(h <= k+4)) {
				 count++;
				 k = h;
			}
		}
		
		System.out.println(count + 1);

	}

}
