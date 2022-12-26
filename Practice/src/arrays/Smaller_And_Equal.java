package arrays;

public class Smaller_And_Equal {

	public static void main(String[] args) {
		int n = 5;
		int x = 4;
		int[] arr = {1, 3, 4, 4 ,6};
		
			int s = 0;
			int e = n-1;
			int count = 0;
			int mid = s + (e-s)/2;
			while(s <= e) {
				
				
				
				if(arr[mid] >= x) {
					s = mid + 1;
					count = mid + 1;
				}
				
				else {
					e = mid - 1;
				}
				mid = s + (e-s)/2;
			}

       System.out.println(e);
	}

}
