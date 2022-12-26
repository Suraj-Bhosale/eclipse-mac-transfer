package String;

public class piOwn {

	public static void main(String[] args) {
		String str = "pippppiiiipi";
        int n = str.length();
       // String str = scan.next();
        String[] arr = new String[n];
       for(int i = 0; i < n; i++){
          arr[i] = Character.toString(str.charAt(i));
       }

    System.out.print(piRecursion(str,n));


	}
    static String ans = "";
	private static String piRecursion(String str, int n) {
		
		if(str.length() == 0){
			return ans;
		}
		
        if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
        	ans += 3.14;
           // System.out.print("3.14");
            str = str.substring(2,str.length());
          }
          else{
        	  ans += str.charAt(0);
          //  System.out.print(str.charAt(0));
            str = str.substring(1,str.length());
          }
        
         piRecursion(str,n);
		return ans;
	}

}
