package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddEven {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);//wtospvrntcebcz;
       // String str = scan.next();
        String str = "wtospvrntcebcz";
       System.out.println(oddEven(str));
        
       // System.out.println((int)str.charAt(0) - (int)'a'+1);

	}

	static String oddEven(String s) {
	       int alphabet[]=new int[26];
	       for(int i=0;i<26;i++)
	       {
	    	   alphabet[i]=0;
	       }
	       int n=s.length();
	       for(int i=0;i<n;i++)
	       {
	           alphabet[(int)s.charAt(i)-97]++;
	       }
	       int x=0,y=0;
	       for(int i=0;i<26;i++)
	       {  if(alphabet[i]!=0)
	          { if(((97+i)&1)==0 && (alphabet[i]&1)==0)
	              x++;
	             else if(((97+i)&1)==1 && (alphabet[i]&1)==1)
	             y++;
	          }
	       }
	       return (((x+y)&1)==0?"EVEN":"ODD");
	   }

}
