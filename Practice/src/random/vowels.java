package random;

public class vowels {

	public static void main(String[] args) {
	  String str = "abacbdeghi";
	  String vowels = "aeiou";
	  int k = 4;
	  
	  int count = 0;
	  
	  while(str.length() > 3) {
		 String bundle = str.substring(0,k);
		// for(int i = 0; i < bundle.length(); i++) {
		 while(bundle.length() > 0) {
			// String bundleCopy = bundle;
			 String strBundle = bundle.substring(0,1);
		  if(vowels.contains(strBundle)){
			  count++;
			  bundle = bundle.substring(1,bundle.length());
			 // System.out.println(bundle);
		  }
		  else {
			  bundle = bundle.substring(1,bundle.length());
			  //System.out.println(bundle);
		  }
			  
		 }
		 System.out.print(count+" ");
		 count = 0;
		str = str.substring(1,str.length());
	  }
	  
//	  String check = "abac";
//	  System.out.println(check.substring(1,check.length()));

	}

}
