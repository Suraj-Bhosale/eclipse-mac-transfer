package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Kth_largest_element_in_stream {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] temp = new int[arr.length];
		int k = 4, i = 0, x = 0;
		
		
		// 3 tests failing in this approach
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int j = 0; j < arr.length; j++) {
//			
//			map.put(arr[j], 0);
//			if(j - i + 1 == k) {
//				 Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
//				 int key = entry.getKey();
//				 temp[x++] = key;
//				 map.remove(key);
//				 i++;
//			}
//			else {
//				temp[x++] = -1;
//			}
//		}
//		
//		
//		for (int j = 0; j < temp.length; j++) {
//			System.out.print(temp[j]+" ");
//			
//		}
		
		
		//Another Approach
		
		  int[] v = kthLargest(k, arr, arr.length);
		    for (int it : v)
		      System.out.print(it+ " ");
		  }
		 

	
	 static int[] kthLargest(int k, int arr[], int n)
     {
       int []ans = new int[n];
    
       // Creating a min-heap using priority queue
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
    
       // Iterating through each element
       for (int i = 0; i < n; i++)
       {
          
         // If size of priority
         // queue is less than k
         if (pq.size() < k)
           pq.add(arr[i]);
         else {
           if (arr[i] > pq.peek()) {
             pq.remove();
             pq.add(arr[i]);
           }
         }
    
         // If size is less than k
         if (pq.size() < k)
           ans[i] = -1;
         else
           ans[i] = pq.peek();
       }
    
       return ans;
     }

}
