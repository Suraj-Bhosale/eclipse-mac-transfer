package random;

public class IceCreamParlour {

	public static void main(String[] args) {
		int testCase = 2  
		int flavours = 5;
		int totalAmt = 4;
		
		int[] arr = {1, 4, 5, 3, 2};
		
		
		for(int i = 0; i<flavours; i++) {
			for(int j = i + 1; j<flavours; j++) {
				if(arr[i] + arr[j] == totalAmt) {
					System.out.println((i+1) + " "+ (j+1));
				}
			}
		}

	}

}
