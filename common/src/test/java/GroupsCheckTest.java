import codewars.GroupsCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author Smily
 * @date 2017/4/21
 */
public class GroupsCheckTest {
    
    @Test
    public void myTests() {
        assertEquals(GroupsCheck.groupCheck("()"), true);
        assertEquals(GroupsCheck.groupCheck("(123)"), true);
        assertEquals(GroupsCheck.groupCheck("(ddd)"), true);
        assertEquals(GroupsCheck.groupCheck("({"), false);
        assertEquals(GroupsCheck.groupCheck("))"), false);
        assertEquals(GroupsCheck.groupCheck("wqww))"), false);
        assertEquals(GroupsCheck.groupCheck(")qq)ww"), false);
        assertEquals(GroupsCheck.groupCheck(")ewqe)"), false);
    }
}
