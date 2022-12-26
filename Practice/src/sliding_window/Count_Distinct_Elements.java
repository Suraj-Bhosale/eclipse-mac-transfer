package sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count_Distinct_Elements {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,3,4,2,3};
		int k = 4;
		int n = 7;
		
		
		//Brutal Approach
//		ArrayList<Integer> list = new ArrayList<>();
//		Map<Integer, Integer> map = new HashMap<>();
//		int s = 0, e = 0,count = 4;
//		for ( e = 0; e < arr.length; e++) {
//			
//			
//			if(map.containsKey(arr[e])) {
//				count = count-1;
//			}
//			else {
//				///count++;
//				map.put(arr[e], 1);
//			}
//			
//			
//			if(e-s+1 == k) {
//				System.out.print(map.size()+" ");
//				list.add(map.size());
//				count = 4;
//				
//				map.remove(arr[s]);
//				s++;
//			
//			}
//			
//		}
//		
//		System.out.println(list);
		
		//Optimized
		
		
        System.out.println(countDistinct(arr,n,k));
	}
	
    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
       
       	ArrayList<Integer> list = new ArrayList<>();
	
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        for (int i = 0; i < k; i++) {
            hM.put(A[i], hM.getOrDefault(A[i], 0) + 1);
        }
        list.add(hM.size());

        for (int i = k; i < n; i++) {

            if (hM.get(A[i - k]) == 1) {
                hM.remove(A[i - k]);
            }
 
            else 
                hM.put(A[i - k],  hM.get(A[i - k]) - 1);           
 

            hM.put(A[i], hM.getOrDefault(A[i], 0) + 1);

             list.add(hM.size());
        }
		
	   return list;
       
       
       
    }

}
