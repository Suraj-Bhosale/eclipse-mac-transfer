package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {   
		
		int[] ar1 = {1, 2, 8, 6, 10};
		int[] ar2 = {4, 5, 6, 9, 12};
		int N = ar1.length;
		int[] temp = new int[N];
		
	    int l=0, m = 0, n = 0;
//	      while(l < ar1.length && m < ar2.length) {
//	        if(ar1[l] < ar2[m]){
//	            temp[n++] = ar1[l++];
//	        }
//	        else{
//	             temp[n++] = ar2[m++];
//	        }
//	        
//	      }
//       
//	      while(l < ar1.length){
//	            temp[n++] = ar1[l++];
//	        }
//	    
//	      while(m < ar2.length){
//	            temp[n++] = ar2[m++];
//	        }
//	    
//	     int s = 0, e = temp.length-1;
//	     int mid = s + (e - s)/2;
//	     System.out.print(temp[mid]+ temp[mid+1]);

	     //Optimization
	    
	    Map<Integer,Boolean> map = new HashMap<>();
	    
	    for (int i = 0; i < N; i++) {
			map.put(ar1[i], null);
			
		}
	     

//	    for (int i = 0; i < N; i++) {
//			map.put(ar2[i], null);
//			
//		}
	    int x = 0;
        for(Map.Entry<Integer, Boolean> entry : map.entrySet()){
            temp[x] = entry.getKey();
            x++;
        }
        
        for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
			
		}
	    
	}

}
