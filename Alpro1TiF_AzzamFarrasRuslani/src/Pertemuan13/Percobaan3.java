package Pertemuan13;

import java.util.Scanner;
import java.util.Arrays;

// @author Azzam Farras Ruslani
public class Percobaan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = {
            {10, 20, 30},
            {40, 50, 60}};

        System.out.println("Mengubah elemen pada array tanpa loooping");
        data[0][0] = 56;
        data[0][1] = 33;

        //Atau kamu dapat menggunakan inputan dinamis
        System.out.println("Inputkan nilai baru pada array "
                + "pada baris 1 dan kolom 0:");
        data[1][0] = input.nextInt();
        System.out.println(Arrays.deepToString(data));

        System.out.println("Mengubah elemen array dengan looping");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Inputkan elemen baru array pada baris " 
                        + i + " dan kolom " + j);
                data[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(data));
    }
}
