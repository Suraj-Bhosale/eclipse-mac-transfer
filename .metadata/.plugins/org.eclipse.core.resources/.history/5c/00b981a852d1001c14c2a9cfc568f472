package Recursion;

import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumCoin
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        int count = 0;
       int value = 0;
       
       minimumCoin(num,count,value);
       
	}
	
	public static void minimumCoin(int num, int count, int value) {
		
        for(int i = 1; i < 100000; i++){
        if(num < 100 && num >= 50){
          value = num - 50;
          count++;
          minimumCoin(num,count,value);
        //  num = value;
        }
        else if(num < 2 && num >= 1){
          value = num - 1;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 5 && num >= 2){
          value = num - 2;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 10 && num >= 5){
          value = num - 5;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 20 && num >= 10){
          value = num - 10;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 50 && num >= 20){
          value = num - 20;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 200 && num >= 100){
          value = num - 100;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 500 && num >= 200){
          value = num - 200;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num < 2000 && num >= 500){
          value = num - 500;
          count++;
          minimumCoin(num,count,value);
        }
        else if(num >= 2000){
          value = num - 2000;
          count++;
          minimumCoin(num,count,value);
        }
      }
           System.out.print(count);
           
       }
}
	
