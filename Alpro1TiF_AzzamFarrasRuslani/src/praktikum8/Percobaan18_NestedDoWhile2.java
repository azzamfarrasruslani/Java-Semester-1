package praktikum8;

import java.util.Scanner;

/**
 *
 * @author 225 - PC 04
 */
public class Percobaan18_NestedDoWhile2 {

    public static void main(String[] args) {
        int i, j, jumlah_baris, jumlah_kolom, jumlah_bil;

        Scanner input = new Scanner(System.in);

        System.out.println("**Program menampilkan deret bilangan dan menghitung jumlah bilangan perbaris**");
        System.out.println("Berapa jumlah baris yang ingin di tampilkan? ");
        jumlah_baris = input.nextInt();
        System.out.println("Berapa jumlah kolom pada setiap baris? ");
        jumlah_kolom = input.nextInt();

        i = 1;

        do {
            j = 1;
            jumlah_bil = 0;
            do {
                System.out.println(" " + j);
                jumlah_bil += j;
                j++;
            } while (j <= jumlah_kolom);
            System.out.println("  " + jumlah_bil);
            i++;
        } while (i <= jumlah_baris);
    }
}
