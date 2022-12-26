package subarray;

import java.util.ArrayList;

public class Find_Index_Subarray_Sum_Of_K {
	
//	Given an unsorted array A of size N that contains only non-negative integers,
//	find a continuous sub-array which adds to a given number S.
//
//	In case of multiple subarrays, return the subarray which comes first on moving from left to right.
			
	public static void main(String[] args) {
		int S = 12;
		int A[] = {1,2,3,7,5};

		 System.out.println(subarraySum(A,A.length,S));
	}
	
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> lst = new ArrayList<>();
            long sum = 0;
       int i = 0,j = 0;
       while(i<n && j<n){
           sum += arr[j];
           if(sum<s){
               j += 1;
           }
           else if(sum==s){
               lst.add(i+1);
               lst.add(j+1);
               return lst;
           }
          else if(sum>s){
              i = i+1;
              j = i;
              sum=0;
          }

       }
       lst.add(-1);
       return lst;
    }

}
