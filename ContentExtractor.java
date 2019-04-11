package strings;

/*
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag and an 
 * end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
 * 
 * Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within 
 * sequences of well-organized tags meeting the following criterion:
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, 
 * because the text starts with an h1 tag and ends with a non-matching h2 tag.
 * Tags can be nested, but content between nested tags is considered not valid. 
 * For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
 * Tags can consist of any printable characters.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Solution assumes we can't have the symbol "<" as text between tags */
public class Solution {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
    }
}