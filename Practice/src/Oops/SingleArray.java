package Oops;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SingleArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int value = 0;
        int[][] arr = new int[N][X];
        List<Integer> elements = new ArrayList<Integer>();
		Set<Integer> set=new HashSet<>();
		Set<Integer> duplicateElements=new HashSet<>();
        for(int i = 1; i <= N; i++){
             for(int j = 1; j <= X; j++){
                 value = i * j;
                // elements.add(value);
                // System.out.println("i value : "+i + " j value : "+ j );
            		//System.out.println("Elements : "+value);
                 
            	arr[i-1][j-1] = value;
            	//System.out.println("Array Elements : "+arr[i-1][j-1]);
        }

	 }
//        int dup = arr[0][0];
//        int count = 0;
//        for(int i = 0; i < N; i++){
//            for(int j = 0; j < X; j++){
//            	System.out.print(arr[i][j]);
//           
//            }
//            System.out.println();
//        }
        
        //System.out.println(count);
        
        duplicate(arr,X);
	}
	
	public static void duplicate(int[][] arrayValues, int X) {
	
        int count = 0;
        // Iteration starts from here
        for (int i = 0; i < arrayValues.length; i++) {
            // This will work for if every row has different number of elements
            for (int j = 0; j < arrayValues[i].length; j++) {
                // Assuming elements of first row are duplicates
                if (arrayValues[i][j] == X)
                    //expectedDuplicates.add(arrayValues[i][j]);
                	count++;
                }
         }
 
        System.out.println(count);
    }
}
