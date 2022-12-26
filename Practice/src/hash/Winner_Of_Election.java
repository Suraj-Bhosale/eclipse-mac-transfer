package hash;

import java.util.HashMap;
import java.util.Map;

public class Winner_Of_Election {

	public static void main(String[] args) {
		int no = 13;
		String[] Votes = {"john","johnny","jackie","johnny","john" ,
							"jackie","jamie","jamie","john","johnny","jamie",
							"johnny","john"};
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < no; i++) {
			String val = Votes[i];
			
			if(map.containsKey(val)) {
				int freq = map.get(val);
				map.put(val, freq+1);
			}
			else {
				map.put(val, 1);
			}
		}
				
		
	      int maxValueInMap = 0;
	        String winner = "";
	        for (Map.Entry<String,Integer> entry : map.entrySet())
	        {
	            String key  = entry.getKey();
	            Integer val = entry.getValue();
	         
	            if (val > maxValueInMap)
	            {
	                maxValueInMap = val;
	                winner = key;
	            }
	 
	            // If there is a tie, pick lexicographically
	            // smaller.
	            else if (val == maxValueInMap && winner.compareTo(key) > 0)
	                winner = key;
	        }
	        System.out.println(winner);
	        
	}

}
