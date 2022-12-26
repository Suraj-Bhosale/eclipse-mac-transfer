package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestParenthesis {

	public static void main(String[] args) {
		String exp = "()(())(";
		int ans = checker(exp) ;
			System.out.println(ans);
	

	}

	private static int checker(String exp) {
		
		Deque<Character> dq = new ArrayDeque <Character> ();
		int count = 0;
		for(int i = 0; i < exp.length(); i++) {
			
			char a = exp.charAt(i);
			
			if(a == '{' || a == '[' || a == '('){
				dq.push(a);
				count++;
				continue;
			}
			
//			if(dq.isEmpty()) {
//				return false;
//			}
			
			char check;
			
			switch(a) {
			
				case ')': 
					if(dq.isEmpty()) {
						continue;
					}
					check = dq.pop();
					if(check == '{' || check == '[') {
					}
					count++;
					break;
					
				case '}': 
					if(dq.isEmpty()) {
						continue;
					}
					check = dq.pop();
					if(check == '(' || check == '[') {
						
					}
					count++;
					break;
			
				
				case ']': 
					if(dq.isEmpty()) {
						continue;
					}
					check = dq.pop();
					if(check == '(' || check == '{') {
			
					}
					count++;
					break;
			}
		}
		int ans = count;
		return (ans);
	}

}
