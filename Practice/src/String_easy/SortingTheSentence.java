package String_easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingTheSentence {

	public static void main(String[] args) {
	
	
          
		String s = "is2 sentence4 This1 a3";
		
		String[] strArr = s.split(" ");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i = 0; i < strArr.length; i++) {
			int index =  strArr[i].charAt(strArr[i].length()-1);
			String value = strArr[i].substring(0,strArr[i].length()-1);
			
			map.put(index, value);
			
		}

		for(Map.Entry<Integer, String>  entry : map.entrySet()) {
			
			String ans = entry.getValue();
			System.out.print(ans+" ");
		}

	}

}
