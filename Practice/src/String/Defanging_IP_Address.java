package String;

public class Defanging_IP_Address {

	public static void main(String[] args) {
		String str = "1.1.1.1";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			
			char x = str.charAt(i);
			
			if(x == '.') {
				temp += "[.]";
				//System.out.print("[.]");
			}
			else
			{
				temp += x;
				//System.out.print(x);
			}
		}

		System.out.println(temp);
	}

}
