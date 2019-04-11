package strings;

/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int len = A.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                A.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        //System.out.println(reversePalindrome)
        
        
        if(Objects.equals(reversePalindrome, A)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
