package random;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class greedyFlorist {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++) {
        	st.push(arr[i]);
        }
        
        for(int i = 0; i < n; i++) {
        	arr[i] = st.peek();
        	st.pop();
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
           int z = ((i/k) + 1) * arr[i];
           sum += z;
        }
        System.out.println(sum);

	}

}
