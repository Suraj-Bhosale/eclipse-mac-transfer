package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RecursiveDigitSum {   //1

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String no = scan.next();
        int itr = scan.nextInt();
        String newNo = "";
        for(int i = 0; i<itr; i++) {
        	
        	 newNo += no;
        }
        
      //  System.out.print(newNo);
        int sum = 0;
     //   while(sum > 9 || sum == 0) {
        
        for(int i = 0; i<newNo.length(); i++) {
        	char value = newNo.charAt(i);
        	int asciValue = value - 48;
        	sum += asciValue;
        }
        
       // System.out.print(sum);
        
        int duplicate = sum;
      //  newNo = duplicate;
        
        int ans = recursiveSum(duplicate);
        System.out.print(ans);
       // }
        
	}
	
//	public static int recursiveSum(String noValue, int sum) {
//		//int duplicate = 0;
//		if(Integer.parseInt(noValue) < 9) {
//			return 0;
//		}
//		
//        for(int i = 0; i<noValue.length(); i++) {
//        	char value = noValue.charAt(i);
//        	int asciValue = value - 48;
//        	sum += asciValue;
//        }
//        
//         int duplicate = sum;
//        String newNo = String.valueOf(duplicate);
//		
//		int ret = recursiveSum(newNo,sum-sum);
//		if(ret < 9) {
//			ret = duplicate;
//		}
//		System.out.println("ret is: "+ ret + " and duplicate is: "+duplicate);
//		return duplicate ;
//		
//	}
	
	public static int recursiveSum(int noValue) {
		//int duplicate = 0;
		if(noValue / 10 == 0) {
			return noValue;
		}
		
		else {
			int sum = 0;
			while(noValue > 0) {
				sum = sum + noValue % 10;
				noValue = noValue / 10;
			}
			return recursiveSum(sum) ;
		}
     }
	
//  	public static int recursiveSum(int n) {
//		//int duplicate = 0;
//        if(n / 10 == 0) return n;
//        else {
//            int r = 0;
//            
//            while(n > 0) {
//                r += n % 10;
//                n /= 10;
//            }
//            
//            return recursiveSum(r);
//        }
//    }
	
	
	


}
