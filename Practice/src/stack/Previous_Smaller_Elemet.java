package stack;

import java.util.Stack;

public class Previous_Smaller_Elemet {
    public static void main(String[] args) {
    	Stack<Integer> st = new Stack<Integer>();
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        
        int[] pge = new int[arr.length];
        for(int i =0; i < arr.length; i++) {
        	
        	if(!st.isEmpty()) {
        		while(!st.isEmpty() && st.peek() >= arr[i]) {
        			st.pop();
        		}
        		
        	}
        	
        	pge[i] = st.isEmpty()? -1: st.peek();
        	st.push(arr[i]);
        }
        
        for (int i = 0; i < pge.length; i++) {
        	 System.out.print(pge[i]+" ");
			
		}
       
	}
}
