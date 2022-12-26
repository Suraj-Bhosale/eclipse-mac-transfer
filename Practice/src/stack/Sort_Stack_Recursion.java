package stack;

import java.util.Stack;

public class Sort_Stack_Recursion {

	
	public static void main(String[] args) {
    	Stack<Integer> st = new Stack<Integer>();
    	st.add(41);
    	st.add(22);
    	st.add(34);
    	st.add(14);
    	st.add(50);
    	st.add(16);
    	st.add(17);
    	sortStack(st);
    	System.out.println(st);
	}
	static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }
 
        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
 
        // Put back the top item removed earlier
        s.push(temp);
    }
 
    // Method to sort stack
    static void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();
 
            // Sort remaining stack
            sortStack(s);
 
            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }
}
