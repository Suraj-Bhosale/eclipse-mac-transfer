package String_easy;

public class Maximum_Number_Words_In_Sentences {

	public static void main(String[] args) {
	String[] str = {"alice and bob love leetcode", 
			      "i think so too", "this is great thanks very much"};
	
//	         int max = 0;
//				for (int i = 0; i < str.length; i++) {
//					int count = 1;
//					for (int j = 0; j < str[i].length(); j++) {
//						char x = str[i].charAt(j);
//						
//						if(x == ' ') {
//							count++;
//						}
//						
//					}
//					max = Math.max(max, count);
//					
//				}
//				
//				System.out.println(max);
	
	
	String str2 = "abcd";
//	String[] arrOfStr = str2.split("[a]");
//	 for (String a : arrOfStr)
//         System.out.println(a);

	 System.out.println(str2.split("a").length);
	}

}
