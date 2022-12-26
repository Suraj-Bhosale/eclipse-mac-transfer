package stack;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Max_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		Queue <Integer> qu = new LinkedList<Integer>();
        Stack <Integer> st = new Stack<Integer> ();
        int value = 0;

        
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			
			if(arr[i] == 1) {
				arr[i + 1] = scan.nextInt();
				 st.push(arr[i + 1]);
			}
			
			if(arr[i] == 2) {
				 st.pop();
			}
			
			if(arr[i] == 3) {
				 System.out.println(st.peek());
			}
		}
	}

}
