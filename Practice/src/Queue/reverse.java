package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {

		public static void main(String[] args) {
			
			Queue<Integer> s = new LinkedList<Integer>();
			s.add(1);
			s.add(2);
			s.add(3);
			s.add(4);


			reverse(s);
			
//			while(!s.isEmpty()) {
//				System.out.println(s.peek());
//				s.pop();
//			}

			 System.out.println(s.toString().replace("[", "").replace("]", "").replace(",", ""));
		}
		
		public static void pushAtBottom(int data, Queue<Integer> s) {

			s.add(data);
			pushAtBottom(data, s);
			
			
		}
		
		
		// Aim of reverse function to empty stack and store data in stack through recursion
		public static void reverse(Queue<Integer> s) {
			if(s.isEmpty()) {
			
				return;
		    }
			int top = s.remove();
			reverse(s);
           s.add(top);
			//pushAtBottom(top,s);
		}



	}

