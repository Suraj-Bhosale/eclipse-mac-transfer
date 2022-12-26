package String;

public class remove_vowels_from_word {

	public static void main(String[] args) {
		String str = "welcome to geeksforgeeks";
		
		for (int i = 0; i < str.length(); i++) {
	     char x = str.charAt(i);
			if(x == 'a' || x== 'e' || x == 'i' || x == 'o' || x == 'u' ) {
				continue;
			}
			
			System.out.print(x);
			
		}

	}

}
