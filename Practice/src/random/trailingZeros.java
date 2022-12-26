package random;
import java.util.*;
import java.lang.*;
import java.io.*;
public class trailingZeros {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int ans = findTrailingZeros(n);
      System.out.print(ans);
	}

     static int findTrailingZeros(int n)
    {
        if (n < 0) // Negative Number Edge Case
            return -1;
 
        // Initialize result
        int count = 0;
 
        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i = i * 5) {
        	System.out.println(i);
            System.out.println(n);
            count = count + n / i;
        }
 
        return count;
    }

}
