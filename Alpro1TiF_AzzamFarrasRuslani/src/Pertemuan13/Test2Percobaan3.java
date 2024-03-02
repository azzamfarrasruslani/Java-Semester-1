package Pertemuan13;

import java.util.Scanner;
import java.util.Arrays;
// @author Azzam Farras Ruslani

public class Test2Percobaan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = {
            {10, 20, 30},
            {40, 50, 60}};

        System.out.println("Mengubah elemen pada array tanpa loooping");
        data[0][0] = 56;
        data[0][1] = 33;

        //Atau kamu dapat menggunakan inputan dinamis
        System.out.print("Inputkan nilai baru pada array "
                + "pada baris 1 dan kolom 0:");
        data[1][0] = input.nextInt();

        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                System.out.println(data1[j]);
            }
        }
        System.out.println(Arrays.deepToString(data));
    }
}
