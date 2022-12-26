package subarray;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		
		int Arr[] = {6, -3, -10, 0, 2};
		// if(Arr.length==0) return -1;
		int max = Arr[0], min = Arr[0], ans = Arr[0];
		int choiceA, choiceB;
		
		for (int i = 1; i < Arr.length; i++) {
           choiceA = max * Arr[i];
           choiceB = min * Arr[i];
           
           max = Math.max(Arr[i], Math.max(choiceA, choiceB));
           min = Math.min(Arr[i], Math.min(choiceA, choiceB));
           ans = Math.max(ans, max);
			
		}

		System.out.println(ans);
	}

}
