package codewars;

import java.util.Arrays;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class Vowels {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
