package subarray;

import java.util.HashMap;

public class Count_Subarray_Distinct_Integer {

	public static void main(String[] args) {

		
		int[] arr = {1, 2, 1, 2, 3};
		int n = arr.length;
		int k = 2;

		 System.out.print(logic(arr,n,k) - logic(arr,n,k-1));

	}
		static int logic(int[] arr, int n, int k) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int count = 0, valStore = 0, j = 0, i = 0;
			while(j < n) {
			
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
					
	             while(map.size() > k) {
	            	 map.put(arr[i], map.get(arr[i])-1);
	            	 if(map.get(arr[i]) == 0) 
	            		 map.remove(arr[i]);
	            		 i++;
	            	
	             }
	             
	             count += j - i + 1;
	             j++;
			
			}
			
			return count;
		}

}

