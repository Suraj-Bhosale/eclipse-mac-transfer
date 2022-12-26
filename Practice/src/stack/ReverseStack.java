package stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);


		reverse(s);
		
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}

		 System.out.println(s.toString().replace("[", "").replace("]", "").replace(",", ""));
	}
	
	public static void pushAtBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
			
		}
		
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);
		
	}
	
	
	// Aim of reverse function to empty stack and store data in stack through recursion
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
		
			return;
	    }
		int top = s.pop();
		reverse(s);

		pushAtBottom(top,s);
	}



}
