package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) return null;
        return Arrays.stream(phrase.trim().split("\\s+")).map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .collect(Collectors.joining(" "));
    }
    
    
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("  a sdf  sdf ! r @ 32432 "));
    }
}
