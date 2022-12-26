package subarray;

import java.util.HashMap;

public class Longest_Subarray_Sum_Divisible_By_K {

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 6, 1, 4, 5};
		int n = arr.length;
		int k = 3;

	
		System.out.println(longSubarrWthSumDivByK(arr,n,k));
	}
	
    static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       int res = 0, sum = 0, rem = 0;
       
       HashMap<Integer, Integer> map = new HashMap<>();
       
       map.put(0, -1);
       
       for(int i = 0; i < n; i++){
           sum += a[i];
           rem = sum % k;
           
           if(rem < 0){
               rem += k;
           }
           
           if(map.containsKey(rem)){
               int index = map.get(rem);
               int len = i - index;
               
               if(len > res){
                   res = len;
               }
           }
           
           else{
               map.put(rem, i);
           }
       }
       return res;
    }

}
