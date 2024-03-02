package Pertemuan13;

import java.util.Scanner;
import java.util.Arrays;
// @author Azzam Farras Ruslani

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan panjang baris");
        int baris = input.nextInt();
        System.out.println("Masukan panjang kolom");
        int kolom = input.nextInt();
        int bil1[][] = new int[baris][kolom];
        int bil2[][] = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Masukan Bil1 baris ke- " + 
                        (i + 1) + " kolom ke- " + (j + 1));
                bil1[i][j] = input.nextInt();
            }
        }
        System.out.println("\n\n");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Masukan Bil2 baris ke- " + 
                        (i + 1) + " kolom ke- " + (j + 1));
                bil2[i][j] = input.nextInt();
            }
        }      
         int c[][] = new int[baris][kolom];
         for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                c[i][j] = bil1[i][j] + bil2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));   
    }
}
