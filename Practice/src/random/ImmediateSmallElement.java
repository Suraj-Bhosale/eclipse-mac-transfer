package random;
import java.io.*;
import java.util.*;
public class ImmediateSmallElement {

	public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       long[] arr = new long[n];
       long[] arr2 = new long[n];
				
			for(int i = 0; i < n; i++){
           arr[i] = scan.nextLong();
         }
   
	        for(int i = 0; i < n; i++){
	            int j = i + 1;
	         
                  if(i == n-1) {
                      arr2[i] = -1;
	                   break;
                   }
                  
                  if(j <= n-1){
	                  if(arr[i] > arr[j]){
	                      arr2[i] = arr[j];
	                      
	                  }
       
	                  else{
	                       arr2[i] = -1;
	                  }
                  }
	        }
	        for(int i = 0; i < n; i++){
	            System.out.print(arr2[i]+ " ");
	        }
	   
	}

}

//2 in stack
class Solution {
	   void immediateSmaller(int arr[], int n) {
	       // code here
	       Stack<Integer> s = new Stack<>();
	       for(int i =n-1; i>=0; i--){
	           int a;
	           if(!s.isEmpty() && s.peek() < arr[i]){
	               a = arr[i];
	               arr[i] = s.pop();
	               
	           }
	           else{
	               a = arr[i];
	               arr[i] = -1;
	           }
	           
	           s.push(a);
	       }
	   }
	}
