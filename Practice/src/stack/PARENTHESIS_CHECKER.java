package stack;
import java.io.*;
import java.util.*;
public class PARENTHESIS_CHECKER {

	public static void main(String[] args) {
		String  str ="{([])}";
		 Queue<Object> pq = new PriorityQueue<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			pq.add(ch);
		}
	     
	      
	 
	 
	        System.out.println(pq);

	}

}
