package Oops;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += ((long)calories[n-i-1]) * Math.pow(2, i);
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
    
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		Scanner scan = new Scanner(System.in);
//        int no = scan.nextInt();
//        double[] arr = new double[no];
//      
//        for(int i = 0; i < no; i++){
//           arr[i] = scan.nextInt();
//        }
//
//        Arrays.sort(arr);
//
//      double sum = 0;
//     int power = 0;
//        for(int i = no -1; i >= 0; i--){
//           
//          System.out.print("Power is: "+power+" ");
//           double logic = Math.pow(2,power) * arr[i];
//           System.out.println("Logic is: "+logic+" ");
//           sum = sum + logic;
//           power = power + 1;
//        }
//
//      int value = (int)sum;
//      // System.out.print(value);
//	}

   // public static int cakeWalk(int no, int arr[])
}


