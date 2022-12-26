package stack;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Stock_Span
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fib = fibonacciDigits(n);
        System.out.print(fib);
       
	}

     public static int fibonacciDigits(long N){
       int fib[]=new int[300];
       fib[0]=00;
       fib[1]=01;
       fib[2]=01;
       fib[3]=02;
       fib[4]=03;
       fib[5]=05;
      // fib[6]=08;
       for(int i=8;i<300;i++){
           fib[i]= (fib[i-1]+fib[i-2])%100;
        }
       return fib[(int)Math.abs(N%300)];
    }
}