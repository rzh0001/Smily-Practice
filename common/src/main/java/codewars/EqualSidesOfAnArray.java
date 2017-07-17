package codewars;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.util.stream.IntStream;

/**
 * @author Smily
 * @date 2017/4/18
 */
public class EqualSidesOfAnArray {
    
    public static int findEvenIndex(int[] arr) {
        // your code
        int total = IntStream.of(arr).sum();
//        System.out.println("totla = " + total);
        int sum = 0;
        
        for (int i = 0; i < arr.length - 1; i++){
            sum += arr[i];
//            System.out.println("sum = " + sum );
//            System.out.println("arr[index] = " + arr[i+1] );
//            System.out.println(total + " - " + sum+" x 2 = "+ arr[i+1] + " ?" );
            if( total - sum * 2 == arr[i+1]){
                return i+1;
            }
        }
        
        return -1;
    }
    
    
    public static void main(String[] args) {
        int index  = 0;
        index = findEvenIndex(new int[] {1,2,3,4,3,2,1});
        System.out.println("index = " + index);
        
    }
}
