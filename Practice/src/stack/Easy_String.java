package stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Easy_String {

	public static void main(String[] args) {
		String s = "aaABBb".toLowerCase();
		Queue <Character> st = new LinkedList<>();
;
//		
		for(int i = 0; i < s.length(); i ++) {
			char n = s.charAt(i);
			st.add(n);
		}
		int count = 0;
		char top = st.peek();
		char temp = top;
		while(!st.isEmpty()) {
			
			top = st.peek();
			if(top == temp) {
				count++;
				st.remove();
			}
			else {
				System.out.print(count+""+temp);
				count = 0;
				temp = top;
			}
		}
		
		System.out.print(count+""+temp);

	}

}
