package praktikum8;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Tugas3 {

    public static void main(String[] args) {
        int tinggi;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Tinggi Segitiga");
        tinggi = input.nextInt();

        int spasi;
        int i;
        int max_spasi = tinggi - 1;

        for (i = 1; i <= tinggi; i++) {

            spasi = max_spasi;

            while (spasi >= 0) {
                System.out.print(" ");
                spasi--;
            }
            int kolom = 1;
            while (kolom <= i) {
                System.out.print(kolom + " ");
                kolom++;
            }
            System.out.println("");
            max_spasi--;
        }
    }
}
