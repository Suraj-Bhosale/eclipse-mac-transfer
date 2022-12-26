package hash;

import java.util.HashMap;
import java.util.Scanner;

public class Count_distinct_pair_with_k_diff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[no];
        for(int i = 0; i < no; i++){
          arr[i] = scan.nextInt();
        }
      
        System.out.println(findPairs(arr,k));
	}
	
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int val:nums )
            {
                map.put(val,map.getOrDefault(val,0)+1);
            
            }
        for(int i:map.keySet())
            {
                if((k==0 && map.get(i)>1)||(k>0 && map.containsKey(i+k)))
                    c++;
            }
        return c;
    }

}
