package two_pointers;

public class Print_sub_array {
	static int k = 15;
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,7,5};
		int n = arr.length;
	    int m = 9;
//		for(int i = 0; i < n; i++) {
//			  arr[i] = arr[i]%2;
//			}
		//printAllSub(n,arr);
		printSubArrays(arr);

	}
	
	 public static void printSubArrays(int [] arrA){

		 int arrSize = arrA.length;
	
		 for (int startPoint = 0; startPoint <arrSize ; startPoint++) {

		   for (int grps = startPoint; grps <=arrSize ; grps++) {

		      for (int j = startPoint ; j < grps ; j++) {
		         System.out.print(arrA[j] + " ");
		      }
		     System.out.println();
		   }
		 }
	  }
	public static void printAllSub(int n, int[] arr){
		int ans = 0;
		for(int i = 0; i < n; i++) {

			for(int j = i; j < n; j++) {
				printSub(arr,i,j);
				
			}
		
	    }
	}

    static int max = 0;
	public static void printSub(int[] arr, int s, int e) {
		int sum = 0;
	
		int i = 0,j = 0;
		for( i = s; i <= e; i++) {
	
			System.out.print(arr[i]+" ");
		}

	System.out.println();
	}
	

}
