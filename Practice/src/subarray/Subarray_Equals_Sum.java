package subarray;

import java.util.Arrays;
import java.util.HashMap;

public class Subarray_Equals_Sum {

	public static void main(String[] args) {
		
		int[] arr = {0,0,5,5,0,0};
		int n = arr.length;
        int x = 0, count = 0;
        int result = 0, sum = 0;
        // Arrays.sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j <= arr.length; j++) {
//
//                for (int k = i; k < j; k++) {
//                    sum+= arr[k];
//
//                // System.out.print(arr[k]+" ");
//                }
//                if(sum == x) {
//                	count++;
//                	
//                }
//                sum = 0;
//              System.out.println();
//            }
//        }
//        System.out.println(count);

        optimazation(arr,n,x);
	}
	//10,2,-2,-20,10
	static void optimazation(int[] arr, int n,int x) {
	       int res = 0, sum = 0, rem = 0,count = 0;
	       
	       HashMap<Integer, Integer> map = new HashMap<>();
	       
	       map.put(0, 1);
	       
	       for(int i = 0; i < n; i++){
	           sum += arr[i];
	           rem = sum - x;

	           
	           if(map.containsKey(rem)){

	        	   count+= map.get(rem);
	           }
	           
	         
	               map.put(sum, map.getOrDefault(sum, 0)+1);
	           
	       }
	       System.out.println(count);
	}

}
