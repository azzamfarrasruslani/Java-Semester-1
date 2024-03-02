package LatihanUAS;

import java.util.Scanner;

public class Latihan10 {

    public static void main(String[] args) {
//         // Menampilkan bilangan kelipatan 3 menggunakan for
//        System.out.println("Bilangan kelipatan 3 (0 - 50) menggunakan for:");
//        for (int i = 0; i <= 50; i += 3) {
//            System.out.print(i + " ");

        Scanner scanner = new Scanner(System.in);

        // Input batas awal dan akhir
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Validasi batas awal harus lebih kecil dari batas akhir
        if (batasAwal >= batasAkhir) {
            System.out.println("Batas awal harus lebih kecil dari batas akhir.");
            return;
        }

        // Tampilkan bilangan kelipatan 5 yang ganjil (kecuali 15)
        System.out.println("Bilangan kelipatan 5 yang ganjil antara " + batasAwal + " dan " + batasAkhir + ":");
        for (int i = batasAkhir; i >= batasAwal; i--) {
            if (i % 5 == 0 && i % 2 != 0 && i != 15) {
                System.out.println(i);
            }
        }
    }
}
