
package LatihanUAS_Teori;
import java.util.Scanner;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan10 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Tinggi Segitiga:");
        int tinggi = input.nextInt();

        int maxSpasi = tinggi - 1;

        for (int i = 1; i <= tinggi; i++) {
            int spasi = maxSpasi;

            // Cetak spasi
            while (spasi >= 0) {
                System.out.print(" ");
                spasi--;
            }

            // Cetak angka
            for (int kolom = 1; kolom <= i; kolom++) {
                System.out.print(kolom + " ");
            }

            System.out.println("");
            maxSpasi--;
        }
    }
}
