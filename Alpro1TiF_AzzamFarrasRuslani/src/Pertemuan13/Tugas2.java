package Pertemuan13;
import java.util.Arrays;
// @author Azzam Farras Ruslani
public class Tugas2 {

    public static void main(String[] args) {
        int data1[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
       
        int data2[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        
        int data3 [][] = new int[3][3];
        
        for (int i = 0; i< 3; i++) {
            for (int j = 0 ; j< 3; j++){
                for (int k = 0; k < 3; k++) {
                    data3[i][j] += data1[i][k] * data2[k][j];
                } 
            }
        }
        System.out.println(Arrays.deepToString(data3));   
        
        
        
       
    }
}
