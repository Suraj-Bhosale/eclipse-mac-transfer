package arrays;

import java.util.ArrayList;

public class Subarray_With_Given_Sum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int x = 12;
		int n = arr.length;
		int i = 0, j = 0,sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i < n && j < n) {
			sum+=arr[j];
			if(sum < x) {
				j++;
			}
			
			else if(sum == x) {
				list.add(i+1);
				list.add(j+1);
				break;
			}
			
			else if(sum > x) {
				i++;
				j = i;
				sum = 0;
			}
		}
		//list.add(-1);
		System.out.print(list);

	}

}
