package random;

public class splitOdd {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }

        int sum = 0;
        int end = n - 1;
        int mid = sum + (end - sum)/2;

        int sum1 = 0;
        int sum2 = 0;


        for(int i = 0; i<n; i++) {
        	sum2 += arr[i];
        }
      
        for(int i = 0; i<=mid; i++) {
        	sum1 += arr[i];
        }

      int part2 = sum2 - sum1;
      if(sum1 % 10 == 0 && part2 % 2 != 0){
        System.out.print("YES");
      }

      else if(part2 % 10 == 0 && sum1 % 2 != 0){
        System.out.print("YES");
      }

      else{
         System.out.print("NO");
      }
	}
}
