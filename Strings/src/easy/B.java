package easy;

import java.util.Stack;

class B {

	static String ans = "";
    static Stack<String> st = new Stack<>();
	public static void main(String[] args) {
		
		int no = 5;
		int i = 0;
		
	 System.out.println(logic(no));
	    
	

		
		//System.out.println(no.substring(3,4));
	}

	static int res = 1;
	private static int logic(int n) {
		if(n == 0) {
			return 1;
		}
		
       
       logic(n-1);
       
       res *= n;
       
		return res;
	}
	 


}
