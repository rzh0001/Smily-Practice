import codewars.FindMissingLetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class FindMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
