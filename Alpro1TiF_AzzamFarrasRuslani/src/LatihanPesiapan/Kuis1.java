
package LatihanPesiapan;
import java.util.Arrays;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Kuis1 {
    public static void main(String[] args) {
        
        
        int A [] = {1,5,2,7};
         
        Arrays.sort(A);
        
        System.out.println(Arrays.toString(A));
        
        int min_tmp = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[0] < min_tmp) {
                min_tmp = A[i];
            }
            System.out.println(A[i]);
        }
        
    }
}
