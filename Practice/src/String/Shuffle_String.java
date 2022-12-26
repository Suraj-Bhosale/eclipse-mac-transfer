package String;

import java.util.HashMap;
import java.util.Map;

public class Shuffle_String {

	public static void main(String[] args) {
		  Scanner  scan = new Scanner(System.in);
          int n = scan.nextInt();
          String str = scan.next();

          int[] arr = new int[n];

          for(int i = 0; i < n; i++){
              arr[i] = scan.nextInt();
          }

         String[] strArr = new String[n];

        HashMap<Integer, Character> map = new HashMap<Integer, Character>();

         for(int i = 0; i < n; i++){
              map.put(arr[i], str.charAt(i));
         }

        for(Map.Entry<Integer, Character> entry : map.entrySet()){
            char x = entry.getValue();
            System.out.print(x);
        }


	}

}
