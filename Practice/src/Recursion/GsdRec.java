package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GsdRec {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int b = scan.nextInt();
            int ans = gsdRecur(a,b);
			System.out.print(ans);

	}

	private static int gsdRecur(int a, int b) {
		if(a == 0 || b == 0) {
			int bigger = max(a,b);
			int smaller = small(a,b);
	        
			return bigger;
		}
		int bigger = max(a,b);
		int smaller = small(a,b);
		
		int change = bigger % smaller;
		
		int checking = gsdRecur(smaller,change);
		return checking;
	}
	
	public static int max(int a, int b) {
        if(a > b) {
			 return a;
		 }
        else {
        	return b;
        }
    }
	
	public static int small(int a, int b) {
        if(a < b) {
			 return a;
		 }
        else {
        	return b;
        }
    }

}
