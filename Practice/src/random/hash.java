package random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash {


	public static void main (String[] args) throws java.lang.Exception
	{
		    int count = 0;
			Scanner scan = new Scanner(System.in);
		    String no = scan.next();

		    int ans = -1;
		  HashMap<Integer,Integer> map = new HashMap<>();

		  for(int i = 0; i < no.length(); i++){
		    int n = no.charAt(i) - 96;
		
		     if(!(map.containsKey(n))){
		        map.put(n,1);
		     }
		    else{
		      Integer freq = map.get(n);
		       map.put(n,freq + 1);
		    }

		

		}

//		  for(int i = 0; i < map.size(); i++){
//		  
//			  int key = 
//			  Integer val = map.get(i);
//			  
//		  }
		  int countX = 0;
		  int countY = 0;
		     for (Integer key: map.keySet()) {
		           
		            
		            int keyVal = key;
		            Integer val = map.get(keyVal);
		            
		         if(keyVal % 2 == 0 && val % 2 == 0) {   
		        	 countX++;
		        }
		         
		         else if(keyVal % 2 == 1 && val % 2 == 1){
		        	 countY++;
		         }


              }
	 
		     
		     int sum = countX + countY;
		     
		     if(sum % 2 == 0) {
		    	 System.out.print("EVEN");
		     }
		     else {
		    	 System.out.print("ODD");
		     }

	  
}
	
}
