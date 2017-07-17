package codewars;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class MiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        int half = (int) Math.round(word.length() / 2.0);
        
        return word.substring(half - 1, half * 2 == word.length() ? half + 1: half);
        
    }
    
    public static void main(String[] args) {
        System.out.println("test".substring(1,3));
        System.out.println(Math.round(10 / 2.0));
        System.out.println(Math.round(9 / 2.0));
        System.out.println("test".substring(1,3));
    }
}
