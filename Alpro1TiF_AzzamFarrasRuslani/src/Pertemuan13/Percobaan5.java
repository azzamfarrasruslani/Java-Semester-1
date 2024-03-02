package Pertemuan13;

import java.util.Arrays;

// @author Azzam Farras Ruslani
public class Percobaan5 {

    public static void main(String[] args) {
        //2 bauh matriks
        int a[][] = {{1, 1, 1},
        {2, 2, 2},
        {3, 3, 3}};

        int b[][] = {{4, 4, 4},
        {5, 5, 5},
        {6, 6, 6}};

        //Array baru untuk menampung penambahan 2 buah matriks
        int c[][] = new int[3][3]; //2 baris and 3 kolom

        //Penambahan 2 bauh matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
        System.out.println(Arrays.toString(a[0]));
    }
}
