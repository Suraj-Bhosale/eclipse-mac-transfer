package String;

import java.util.*;
import java.lang.*;
import java.io.*;
public class merge_2_string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        Queue<Character> q1 = new LinkedList<Character>();
        Queue<Character> q2 = new LinkedList<Character>();
      
        for(int i = 0; i<str1.length(); i++) {
        	char x = str1.charAt(i);
            q1.add(x);
        }

        for(int i = 0; i<str2.length(); i++) {
        	char x = str2.charAt(i);
            q2.add(x);
        }

    

       while(!q1.isEmpty() || !q2.isEmpty()){
         
         
         if(!q1.isEmpty()){
           System.out.print(q1.peek());
           q1.remove();
         }
         if(!q1.isEmpty()){
           System.out.print(q2.peek());
           q2.remove();
           
           }
       }

	}

}
