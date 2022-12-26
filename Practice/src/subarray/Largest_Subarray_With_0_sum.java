package subarray;

import java.util.HashMap;

public class Largest_Subarray_With_0_sum {

	public static void main(String[] args) {
		int A[] = {15,-2,2,-8,1,7,10,23};
		

		System.out.println(maxLen(A,A.length));
		
	}
	
    static int maxLen(int arr[], int n)
    {
 	       HashMap<Integer,Integer>map=new HashMap<>();
	       
	       int sum=0;
	       map.put(0,-1);
	       int len=0;
	       for(int i=0;i<n;i++){
	           
	           sum=sum+arr[i];
	           if(map.containsKey(sum)){
	              int temp_len = i-map.get(sum);
	              if(len < temp_len){
	                  len = temp_len;
	              }
	           }else{
	               map.put(sum,i);
	              }
	       }
	       return len;
    }

}
