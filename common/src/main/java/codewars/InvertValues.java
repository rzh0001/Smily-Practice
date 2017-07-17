package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        
        return IntStream.of(array).map(n -> n = -n).toArray();
    }
}
