package codewars;

import java.util.Stack;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class GroupsCheck {
    public static boolean groupCheck(String s){
    
        Stack<Character> stack = new Stack<>();
        char[] tmp = s.replaceAll("[^\\(\\)\\[\\]\\{\\}]", "").toCharArray();
        
        for (char c: tmp){
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.push(c); break;
                case ')':
                    if (stack.isEmpty() || '(' != stack.peek()) return false; else stack.pop(); break;
                case '}':
                    if (stack.isEmpty() || '{' != stack.peek()) return false; else stack.pop(); break;
                case ']':
                    if (stack.isEmpty() || '[' != stack.peek()) return false; else stack.pop(); break;
                default:
                    return false;
            }
        
        }
        
        return stack.isEmpty();
    }
}
