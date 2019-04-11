package strings;

/*
 * We define the following terms:
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
 *  A < B < ... < Y < Z < a < b < ... < z
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * A substring of a string is a contiguous block of characters in the string. 
 * For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * Given a string, s, and an integer, k, complete the function so that it finds 
 * the lexicographically smallest and largest substrings of length .
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String subString;
        
        for(int i=0; i <= s.length() - k; i++){
            subString = s.substring(i, (i + k));
            if(subString.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = subString;
            }
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}