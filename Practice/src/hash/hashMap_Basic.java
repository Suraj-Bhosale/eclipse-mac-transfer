package hash;

import java.util.HashMap;

public class hashMap_Basic {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		
//		hs.put(1, "a");
//		hs.put(2, "b");
//		hs.put(3, "c");
		
		String str = "abdhehdjdk";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	    for(int i = 0; i < str.length(); i++){
	        map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
	    }
	}

}
