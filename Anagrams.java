package strings;

/*
 * Two strings,  a and b, are called anagrams if they contain all the same characters in the same frequencies. 
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * Complete the function in the editor. If  and  are case-insensitive anagrams, 
 * print "Anagrams"; otherwise, print "Not Anagrams" instead.
 */

import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String a, String b) {
	    // Complete the function
	    a = a.toUpperCase();
	    b = b.toUpperCase();
	    int alength = a.length();
	    int blength = b.length();
	    char[] firstarr = a.toCharArray();
	    char[] secondarr = b.toCharArray();
	    Arrays.sort(firstarr);
	    Arrays.sort(secondarr);
	    String sorteda = String.valueOf(firstarr);
	    String sortedb = String.valueOf(secondarr);
	    if(Objects.equals(sorteda, sortedb)) {
	        return true;
	    }else {
	        return false;
	    }
	}

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    String a = scan.next();
	    String b = scan.next();
	    scan.close();
	    boolean ret = isAnagram(a, b);
	    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
