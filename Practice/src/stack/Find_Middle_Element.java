package stack;

import java.util.Stack;

public class Find_Middle_Element {

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
    	int midd = findMiddle(st,mid,i);
        System.out.println(midd);
	}
 
     static int middleElem = 0;
	private static int findMiddle(Stack<Integer> st,int mid, int i) {
		
		if(i == mid) {
			
			middleElem = st.pop();
		
			return middleElem;
		}
		
       int top = st.pop();
       findMiddle(st,mid,i+1);
	   return middleElem;
	}

}
