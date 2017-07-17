package codewars;

/**
 * @author Smily
 * @date 2017/4/21
 */
public class CalculateRotation {
    public static int shiftedDiff(String first, String second){
        for (int i = 0; i < first.length(); i++){
            int index = second.indexOf(first.substring(0,first.length()-i));
            if (index == -1 ){
                continue;
            } else if (index == 0){
                return -1;
            } else {
                if (first.substring(first.length() - index + 1).equals(second.substring(0,index - 1))){
                    return i;
                }
                return -1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String first = "eecoff";
        String second = "coffee";
        System.out.println(second.substring(0,1));
        System.out.println(second.substring(0,2));
        System.out.println(second.substring(0,3));
        System.out.println(second.substring(0,4));
        System.out.println(second.substring(2,6));
        System.out.println(first.substring(first.length() - 4 + 1));
        System.out.println(second.indexOf("ee"));
    }
}
