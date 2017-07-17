package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class CamelCase {
    public static String toCamelCase(String s){
        if (s ==null|| s.isEmpty()) return "";
        return s.charAt(0) + Arrays.stream(s.trim().split("(-|_)")).map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1)).collect(Collectors.joining()).substring(1);
    }
    
    
    public static String autocorrect(String input) {
        // your code here
        return Arrays.stream(input.split(" ")).map(str -> str.replaceAll("(\\bu+\\b)|(\\byou+\\b)","your sister")).collect(Collectors.joining(" "));
        
        
    }
    
    public static void main(String[] args) {
        System.out.println(CamelCase.autocorrect("u you uu youtube"));
        System.out.println(CamelCase.autocorrect("i miss you! you're aaa"));
    
    }
}
