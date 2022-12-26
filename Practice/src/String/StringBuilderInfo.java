package String;

import java.util.Scanner;

public class StringBuilderInfo {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();

		//stb.append("ABC");
		
		
		String str = "a";
		String str2 = "d";
		Scanner scan = new Scanner(System.in);

		char[] s = {'h','e','l','l','o'};
		String ss = null;
		
        for(int i = s.length-1; i >=0; i--){
           ss = " "+ s[i];
        }
        
        System.out.print(ss);

       
	}

}
