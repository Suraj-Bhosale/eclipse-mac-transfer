package stack;

import java.util.Stack;

public class Next_Greater_Element_Stack {

    static int arr[] = { 11, 13, 21, 3 };
    
    /* prints element and NGE pair for all
    elements of arr[] of size n */
    public static void printNGE()
    {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];
 
        // iterate for rest of the elements
        for (int i = arr.length - 1; i >= 0; i--)
        {
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            if (!s.empty())
            {
                while (!s.empty() && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(nge[i]+" ");
    }
 
    /* Driver Code */
    public static void main(String[] args)
    {
        // NextGreaterElement nge = new
        // NextGreaterElement();
       // printNGE();
    	long[] arr = { 1, 3, 2, 4 };
    	
    	System.out.println(nextLargerElement(arr,arr.length));
    }
    
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st = new Stack<>();
        long[] nge = new long[n];
        for(int i = arr.length - 1; i >= 0; i--){
            
            if(!st.isEmpty()){
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
            }
            
            nge[i] = st.empty()? -1: st.peek();
            st.push(arr[i]);
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(nge[i]+" ");
        }
    
        return nge;
    } 

}
