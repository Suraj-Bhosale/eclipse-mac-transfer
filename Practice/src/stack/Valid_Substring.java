package stack;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Valid_Substring
{
public static void main(String[] args) {
      
		String exp = "((()";
		int ans = findMaxLen(exp) ;

    System.out.println(ans);
		
}

	
    static int findMaxLen(String str)
    {
        int n = str.length();
 
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
 
  
        int result = 0;

        for (int i = 0; i < n; i++)
        {
           
            if (str.charAt(i) == '(')
                stk.push(i);

            else
            {
   
                if(!stk.empty())
                    stk.pop();
 
                if (!stk.empty())
                    result
                        = Math.max(result,
                                   i - stk.peek());
 
                else
                    stk.push(i);
            }
        }
 
        return result;
    }

}