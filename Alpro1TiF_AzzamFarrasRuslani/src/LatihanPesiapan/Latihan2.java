package LatihanPesiapan;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
import java.util.Arrays;

public class Latihan2 {

    public static void main(String[] args) {

//        int[][] bil1 = {
//            {1, 1, 1},
//            {1, 1, 1},
//            {1, 1, 1}};
//        
//        int[][] bil2 = {
//            {2, 2, 2},
//            {2, 2, 2},
//            {2, 2, 2}};


        int[][] bil1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        
        int[][] bil2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        
        int bil3 [][] = new int [3][3];
        for (int i = 0 ; i < bil3.length; i++) {
            for (int j = 0 ; j < bil3.length; j++) {
                for(int k = 0; k < bil3.length; k++) {
                    bil3 [i][j] += bil1[i][k] * bil2[k][j];
                }
            }
        }
        
//        int bil3 [][] = new int [3][3];
//        for (int i = 0 ; i < bil3.length; i++) {
//            for (int j = 0 ; j < bil3.length; j++) {
//                for(int k = 0; k < bil3.length; k++) {
//                    bil3 [i][j] += bil1[k][i] * bil2[j][k];
//                }
//            }
//        }
        
        System.out.println(Arrays.deepToString(bil3));
        
        
        for (int i = 0; i < bil3.length; i++) {
            for (int j = 0; j < bil3[i].length; j++) {
                System.out.println(bil3[i][j]);
                
            }
            
        }
    }
}
