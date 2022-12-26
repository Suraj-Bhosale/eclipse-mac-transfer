package random;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintDistinctElement {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }

      int count = 0;
      int x = arr[0];
     for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
               
                if (i == j)
                System.out.print(arr[i] + " ");
              
        }
    }

	
	
}
