package RevisiLaporan;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Pertemuan3Lat2 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan batas
        System.out.print("Masukkan batas: ");
        int batas = scanner.nextInt();

        // Menutup objek Scanner
        scanner.close();

        // Mencetak bilangan kuadrat hingga batas tertentu
        for (int i = 1; i <= batas; i++) {
            int kuadrat = i * i;
            System.out.print(kuadrat + " ");
        }
    }
}
