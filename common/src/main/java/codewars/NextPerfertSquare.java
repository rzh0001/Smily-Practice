package codewars;

/**
 * @author Smily
 * @date 2017/4/19
 */
public class NextPerfertSquare {
    
    public static long findNextSquare(long sq) {
        Double root = Math.sqrt(sq);
        if (root == root.intValue()){
            return (root.longValue() + 1) * (root.longValue() + 1);
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Double root = Math.sqrt(121);
        
        if (root == root.intValue()){
            System.out.print(root);
        }
    }
}
