package arrays;

public class best_time_to_buy_sell_stock_2 {

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3 ,6, 4};
		int n = arr.length;
		

       int buyStock = arr[0];
       int MaxProfit = 0;

                for(int i = 1; i < n; i++){
                    if(buyStock > arr[i]){
                        buyStock = arr[i];
                    }

                  else {
                      if((arr[i] - buyStock) > MaxProfit){
                    MaxProfit = arr[i] - buyStock;
                  }
                  }
                }

        System.out.print(MaxProfit);
	}

}
