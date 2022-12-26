package arrays;

//3
//10 3 31

	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class Largest_no_from_list 
	{
		public static void main (String[] args) throws java.lang.Exception
		{
				Scanner  scan = new Scanner(System.in);
	          int n = scan.nextInt();
	                     Vector<String> arr; 
	           arr = new Vector<>();

	          for(int i = 0; i < n; i++){
	              arr.add(scan.next());
	          }

	        printLargest(arr);
		}

	     static void printLargest(Vector<String> arr)
	    {
	 
	        Collections.sort(arr, new Comparator<String>()
	        {
	          
	           public int compare(String X, String Y)
	            {
	                String XY = X + Y;
	                String YX = Y + X;
	                return XY.compareTo(YX) > 0 ? -1 : 1;
	            }
	        });
	 
	        Iterator it = arr.iterator();
	 
	        while (it.hasNext())
	            System.out.print(it.next());
	    }
	}
