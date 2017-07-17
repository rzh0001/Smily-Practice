package codewars;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class FindMissingLetter {
    
    public static final String letters = "abcdefghijklmnopqrstuvwxyz";
    
    // 65 - 90  大写
    // 97 - 122 小写
    
    public static char findMissingLetter(char[] array)
    {
        for (int i = 1; i < array.length; i ++){
            if (array[i] - array[i-1] != 1){
                return (char) (array[i-1]+1);
            }
        }
        return ' ';
    }
}
