package arrays;

import java.util.ArrayList;

public class Leader_In_Array {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		int n = arr.length;
		
	//	leaders(arr,n);
		
		int s = 0, e = 0;
		int count = 0;
		while(s < n-1) {
			
            if(arr[s] >= arr[e]){
                count++;
            }
		}

	}

	

	    static void leaders(int arr[], int n){
	        
	       ArrayList<Integer> ans = new ArrayList<Integer>();
	       for(int i = 0; i < n - 1; i++){
	           int count = 0;
	           for(int j = i+1; j < n; j++){
	               if(arr[i] >= arr[j]){
	                   count++;
	               }
	               
	              // System.out.print("J: "+ j +" == "+( n-1)+" && "+" count "+ count + " -> "+(n -i)+" | ");
	               if(j == (n-1) && count == ((n-1) - i)){
	                   ans.add(arr[i]);
	               }
	           }
	       }
	       ans.add(arr[n-1]);
	       System.out.println(ans);
	    }
	
}
