import codewars.NextPerfertSquare;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class NextPerfertSquareTest {
    
    @Test
    public void test1() {
        assertEquals(144, NextPerfertSquare.findNextSquare(121));
    }
    
    @Test
    public void test2() {
        assertEquals(676, NextPerfertSquare.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NextPerfertSquare.findNextSquare(114));
    }
    
}
