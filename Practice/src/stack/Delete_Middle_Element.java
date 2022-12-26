package stack;

import java.util.Stack;

public class Delete_Middle_Element {
    public static void main(String[] args) {
    	Stack<Integer> st = new Stack<Integer>();
    	st.add(1);
    	st.add(2);
    	st.add(3);
    	st.add(4);
    	st.add(5);
    	st.add(6);
    	st.add(7);
    	int s = 0;
    	int e = st.size() - 1;
    	int mid = 0 + (e - s)/2;
    	int i = 0;
    	removeDelete(st,mid,i);
         System.out.print(st);
	}
 
     
	private static void removeDelete(Stack<Integer> st,int mid, int i) {
		
		if(i == mid) {
			st.pop();
			return;
		}
		
       int top = st.pop();
       removeDelete(st,mid,i+1);
	   st.push(top);
	}

}
