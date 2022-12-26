package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Least_Greater_Element {

//	public static void main(String[] args) {
//		int[] arr = {1, 4, 2, 6};
//		
//		int n = arr.length;
//		
//		
//		int maxLeast = -1;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//		
//			 map.clear();
//			 for (int j = i + 1; j < arr.length; j++) {
//				
//				 if(arr[i] < arr[j]) {
//					map.put(arr[j], null); 
//				 }
//			 }
//			 if(!map.isEmpty()) {
//			 Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
//			 int x = entry.getKey();
//			
//			 System.out.print(x+" ");
//			 }
//			 
//			 else {
//				 System.out.print(maxLeast+" ");
//			 }
//			
//		}
//
//	}
	
	
	public static void main(String[] args) { /// All tests passed
	    int[] arr = {1,4,2,6};
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        int min = -1;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] > arr[i]) {
	                if (min == -1) {
	                    min = arr[j];
	                } else {
	                    min = min > arr[j] ? arr[j] : min;
	                }
	            }
	        }
	        arr[i] = min;
	    }
	    for(int i =0; i < arr.length; i++)
	        System.out.print(arr[i] + " "); 
	    }
          


}
