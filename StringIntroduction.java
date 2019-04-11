package strings;

/*
 * "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number of characters in a String is called the length, 
 * and it can be retrieved with the String.length() method.
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
 * Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length = A.length() + B.length();
        System.out.println(length);
        int compare = A.compareTo(B);
        if(compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String first = A.substring(0,1).toUpperCase() + A.substring(1);
        String second = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(first + " " + second);
       
        
    }
}
