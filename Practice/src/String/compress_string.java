package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class compress_string {

    static void printRLE(String s)
    {
        for (int i = 0; i < s.length(); i++) {
 
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)+ "" + count + " ");
        }
 
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        printRLE("GeeeEEKKKss");
        printRLE("ccccOddEEE");
    }

}
