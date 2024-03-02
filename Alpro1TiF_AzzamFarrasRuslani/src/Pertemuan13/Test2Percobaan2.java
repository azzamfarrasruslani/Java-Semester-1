package Pertemuan13;

import java.util.Arrays;
import java.util.Scanner;

// @author Azzam Farras Ruslani
public class Test2Percobaan2 {
    public static void main(String[] args) {
        int[][] data1 = new int[2][2];
        int[][] data2 = new int[2][2];
        Scanner input = new Scanner(System.in);

        //Mengisi array secara manual
        data1[0][0] = 1;
        data1[0][1] = 2;
        data1[1][0] = 0;
        data1[1][1] = 2;
        System.out.println("Array yang diinput manual");
        int k = 0;
        while (k < data1.length) {
            int j = 0;
            while (j < data1[k].length) {
                System.out.println(data1[k][j] + "\t");
                j++;
            }
            k++;
        }
        //Mengisi array secara looping
        System.out.println();
        System.out.println("Input elemen secara dinamis");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.println("Input elemen array baris ke-" 
                        + i + " dan kolom ke-" + j);
                int elemen = input.nextInt();
                data2[i][j] = elemen;
            }
        }
        System.out.println(Arrays.deepToString(data2));
    }
}
