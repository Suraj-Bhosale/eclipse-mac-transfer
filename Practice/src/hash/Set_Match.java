package hash;

import java.util.HashMap;

public class Set_Match {

	public static void main(String[] args) {
		
		int[] nums = {1, 7, 4, 3, 4, 8, 7};
		
		int[] result = new int[2];
		
		HashMap<Integer, Integer> map = new HashMap<>();
	   
		for(int i = 0; i < nums.length; i++) {
			
			int no = nums[i];
			
			if(!map.containsKey(no)) {
				map.put(no, 1);
			}
			else {
				Integer freq = map.get(no);
				map.put(no, +freq+1);
			}
			
		}
		
		System.out.println(map);

	}

}
