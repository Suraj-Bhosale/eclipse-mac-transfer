package String;
import java.util.*;

import java.lang.*;
import java.io.*;
public class check_string_rotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String str2 = scan.next();

		System.out.print(checkStringRotation(str,str2)? 1 : 0);
		
		

	}

	private static boolean checkStringRotation(String str, String str2) {
		
		if(str.length() != str2.length()) {
			return false;
		}
		
		String temp = str.concat(str);
		
		return temp.indexOf(str2) != -1;
    }

}
