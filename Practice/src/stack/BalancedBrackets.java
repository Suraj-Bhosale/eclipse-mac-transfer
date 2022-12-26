package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	public static void main(String[] args) {
		String exp = "()()()()";
		if(isBalanced(exp)) {
			System.out.println("True");
			
		}
		else {
			
			System.out.println("False");
		}

	}

	private static boolean isBalanced(String exp) {
		
		Deque<Character> dq = new ArrayDeque <Character> ();
		
		for(int i = 0; i < exp.length(); i++) {
			
			char a = exp.charAt(i);
			
			if(a == '{' || a == '[' || a == '('){
				dq.push(a);
				continue;
			}
			
			if(dq.isEmpty()) {
				return false;
			}
			
			char check;
			
			switch(a) {
			
				case ')': 
					
					check = dq.pop();
					if(check == '{' || check == '[') {
						return false;
					}
					break;
					
				case '}': 
					check = dq.pop();
					if(check == '(' || check == '[') {
						return false;
					}
					break;
			
				
				case ']': 
					check = dq.pop();
					if(check == '(' || check == '{') {
						return false;
					}
					break;
			}
		}
		return (dq.isEmpty());
	}

}
