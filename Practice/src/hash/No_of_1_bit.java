package hash;

import java.util.*;
import java.io.*;

public class No_of_1_bit {
    static int count = 0;
	static int bin(int n)
	{
        Queue<Integer> qu = new LinkedList<>();
		if (n > 1){
			bin(n / 2);
        }

        // = qu.add(n % 2);
		//System.out.println(n % 2);
		
		if(n % 2 == 1) {
			count++;
		}
		return count;
	}


	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
		int qu = bin(no);
        System.out.print(qu);
        // 
        // for(int i = 0; i < str.length(); i++){
        //    char c = str.charAt(i);
        //    if(c == '1'){
        //      count++;
        //    }
        // }
     // System.out.print(count);
		
		
	}

}
