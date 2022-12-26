package Oops;

public class Leetcode {

	public static void main(String[] args) {

	
	  System.out.println(factorial(5));
	 // System.out.println("Return to main f() ");
	}

	 public static int factorial(int n) {
		// System.out.println("Value Of n "+ n);
		 if(n == 1) {
            return 1;
		 }

 
	     // System.out.println("Before ");
		  int smallerAns = factorial(n-1);
		 // System.out.println("Value Of second n "+ n);
		 // System.out.println("Value of smallerAns "+ smallerAns);
		  int biggerAns = n * smallerAns;
		 // System.out.println("Value of biggerAns "+ biggerAns);
		  
		  return biggerAns;
		 
	 }
 
}

