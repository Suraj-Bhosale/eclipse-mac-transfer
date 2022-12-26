package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        int no = scan.nextInt();
//        int ans = towerHanoi(no,0);
//        System.out.print(ans);
//
//	}

	static int towerOfHanoi(int n, char from_rod,
            char to_rod, char aux_rod)
	{
		int count = 0;
		int total = 0;
		if (n == 0)
		{
		return n;
		}
	
		count++;
		//total = total + count;
		//System.out.print(total);
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		
//		System.out.println("Move disk "+ n + " from rod " +
//		               from_rod +" to rod " + to_rod );
		total = count + total;
		System.out.print(recursiveSum(total));
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
		 
		return count;
	}
		
		//Driver code
	public static void  main(String args[])
	{
		int n = 3; // Number of disks
		
		int ans = towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
		System.out.println(ans);
	}
	
	public static int recursiveSum(int noValue) {
		
		if(noValue / 10 == 0) {
			return noValue;
		}
		
		else {
			int sum = 0;
			while(noValue > 0) {
				sum = sum + noValue % 10;
				noValue = noValue / 10;
			}
			return recursiveSum(sum) ;
		}
     }

}
