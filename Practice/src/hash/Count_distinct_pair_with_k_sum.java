package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Count_distinct_pair_with_k_sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[no];
        for(int i = 0; i < no; i++){
          arr[i] = scan.nextInt();
        }
      
        printpairs(arr,k);
	}
	
    public static void printpairs(int arr[], int sum)
    {int count = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {

            	count++;
            }
            s.add(arr[i]);
        }
        
        System.out.println(count);
    }


}
