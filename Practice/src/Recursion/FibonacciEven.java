package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FibonacciEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        long ans = recursEven(index,50,1,0,1);
       // System.out.print(ans+" ");

	}

	static int c = 0;
	static long count = 0;
	private static long recursEven(int index, int upto, int itr,int a, int b) {
	
		if(itr == upto) {
			c = a + b;
			return c;
		}
		
//		if(itr == upto) {
//			c = a + b;
//			return c;
//		}
			
		c = a + b;	
		
		if(c % 2 == 0) {
			count++;
			if(count == index) {
				long ans = c;
				System.out.print(ans);
			}
			
		}
		
		return recursEven(index,upto,itr+1,b,c);
	}

}

class FibonacciEven{
	static long evenFib(int n)
	{
		if (n < 1)
		return n;

		if (n == 1)
		return 2;

		// calculation of
		// Fn = 4*(Fn-1) + Fn-2
		return ((4 * evenFib(n-1)) +
					evenFib(n-2));
	}

	// Driver Code
	public static void main (String[] args)
	{
		int n = 50;
		System.out.println(evenFib(n));
	}
}
