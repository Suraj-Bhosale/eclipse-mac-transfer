package two_pointers;

import java.util.HashMap;

public class No_of_good_pairs {

	public static void main(String[] args) {
	   int[] arr = {1,1,1,1};
	   int n = arr.length;
	   
	   int sum = 0, e = 1, count = 0;
	   HashMap<Integer,Integer> map = new HashMap<>();
	   for(int i = 0; i < n; i++) {
		   if(map.get(arr[i]) != null) {
			   count = map.get(arr[i]);
			   count = count + 1;
			   sum = sum + count;
		   }
		   
		   map.put(arr[i], count);

	   }
	   
	   System.out.println(sum);

	}

}
