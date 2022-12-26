package String;

import java.util.HashSet;

public class Longest_Palindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		
		HashSet<Character> set = new HashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(set.contains(c)) {
				count += 2;
				set.remove(c);
			}
			else {
				set.add(c);
			}
			
		}
		
		if(!set.isEmpty())
			count++;
		
		
		System.out.println(count);
		

	}

}
