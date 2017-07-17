import codewars.Vowels;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
    
    
    
}
