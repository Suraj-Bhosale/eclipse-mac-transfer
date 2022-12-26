package Oops;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        
        int[][] arr = new int[no][no];
        
        for(int i = 0; i<no; i++) {
        	for(int j = 0; j<no; j++) {
        	arr[i][j] = scan.nextInt();
        	}
        }
        
        int diaOne = 0;
        int diaTwo = 0;
        
        for(int i = 0; i<no; i++) {
        	for(int j = 0; j<no; j++) {
        		
        		if((i == j)) {
        			diaOne = diaOne + arr[i][j];
//        			//System.out.print(arr[i][j]+" ");
        		}
        	
        	
        	}
        	//System.out.println();
        }
        
        for(int i = 0; i<arr.length; i++) {
        	for(int j = 0; j<arr[0].length; j++) {
        		
        	
        		 if((i + j) == (no - 1) ) {
        			 diaTwo = diaTwo + arr[i][j];
        			//System.out.print(arr[i][j]+" ");
        		}
        	
        	}
        	//System.out.println();
        }
         int result = diaOne - diaTwo;
         if (result < 0) {
        	 System.out.println(-(result));
         }
       

	}

}
