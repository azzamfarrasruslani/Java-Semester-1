package Pertemuan13;

import java.util.Arrays;

// @author Azzam Farras Ruslani
public class Test1Percobaan5 {

    public static void main(String[] args) {
        //2 buah matriks
        int a[][] = {{1, 1, 1},
        {2, 2, 2},
        {3, 3, 3},
        {4, 4, 4}};

        int b[][] = {{4, 4, 4},
        {5, 5, 5},
        {6, 6, 6},
        {7, 7, 7}};
 
        int c[][] = new int[4][3]; 

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
        System.out.println(Arrays.toString(a[0]));
    }

}
