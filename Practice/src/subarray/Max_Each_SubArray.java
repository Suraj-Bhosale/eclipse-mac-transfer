package subarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Each_SubArray {
	
//	Given an array arr[] of size N and an integer K.
//	Find the maximum for each and every contiguous subarray of size K.
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		
		System.out.println(max_of_each_subarrays(arr,arr.length,3));

	}
	
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        
        int j, max;
  
        for (int i = 0; i <= n - k; i++) {
  
            max = arr[i];
  
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            ans.add(max);
        }
        return ans;
    }
    
    //Optimized
    
    static ArrayList <Integer> max_of_each_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        
        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        for(; i < k; i++) {
        	qu.add(arr[i]);
         }
        	ans.add(qu.peek());
  
        	qu.remove(arr[0]);
       
        
        for(; i < n; i++) {
        	qu.add(arr[i]);
        	ans.add(qu.peek());
        	qu.remove(i - k + 1);
        }
        return ans;
    }

}
