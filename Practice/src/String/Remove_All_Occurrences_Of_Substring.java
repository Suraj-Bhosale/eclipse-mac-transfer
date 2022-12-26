package String;

public class Remove_All_Occurrences_Of_Substring {

	public static void main(String[] args) {

		String s = "aabababa", part = 	"aba";

		while(s.contains(part)) {
			 s = s.replaceFirst(part, "");
		}

		System.out.println(s);
	}

}
