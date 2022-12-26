package arrays;

public class best_time_to_buy_sell_stock {

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3 ,6, 4};
		int n = arr.length;
		

        int sum = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1])
                sum = sum + arr[i] - arr[i-1];
        }

        System.out.print(sum);
	}

}
