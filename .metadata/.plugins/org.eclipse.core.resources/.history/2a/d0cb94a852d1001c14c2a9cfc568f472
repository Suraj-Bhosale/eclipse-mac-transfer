package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RajeshHellRecur
{
  public static void helloRec1(int index,int n,int arr[],int sum){
  if(index==n){
     sum+=arr[index];
     System.out.println("Case "+ index + ": "+sum);
     return;
      }
    sum+=arr[index];
    helloRec1(index+1,n,arr,sum);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int itr = sc.nextInt();
      
      for(int j=0;j<itr;j++){
        int n = sc.nextInt();
        int [] arr = new int[n];
        
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
         }
     helloRec1(0,n,arr,0);

	}
      
  	public static int recursiveSum(int n) {
		//int duplicate = 0;
        if(n / 10 == 0) return n;
        else {
            int r = 0;
            
            while(n > 0) {
                r += n % 10;
                n /= 10;
            }
            
            return recursiveSum(r);
        }
		

		
		
	}
	
}
}
