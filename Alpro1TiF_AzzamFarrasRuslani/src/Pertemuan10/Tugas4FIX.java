package Pertemuan10;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas4FIX {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Mendefinisikan array untuk menyimpan data pengunjung
        String[] namaPengunjung = new String[100];
        String[] tujuanMenginap = new String[100];
        String[] asalPengunjung = new String[100];

        // Menggunakan variabel untuk melacak jumlah data yang sudah diinput
        int jumlahData = 0;

        // Loop untuk menginput data pengunjung
        do {
            System.out.print("Masukkan nama pengunjung: ");
            namaPengunjung[jumlahData] = scanner.nextLine();

            System.out.print("Masukkan tujuan menginap: ");
            tujuanMenginap[jumlahData] = scanner.nextLine();

            System.out.print("Masukkan asal pengunjung: ");
            asalPengunjung[jumlahData] = scanner.nextLine();

            jumlahData++; // Menambah jumlah data

            // Memeriksa apakah user ingin menginputkan data lagi
            System.out.print("Apakah ingin menginputkan data lagi? (y/n): ");
            String jawaban = scanner.nextLine();

            if (!jawaban.equalsIgnoreCase("y")) {
                break; // Keluar dari loop jika user tidak ingin input lagi
            }

        } while (jumlahData < 100); // Loop berhenti jika sudah mencapai batas maksimal

        // Menampilkan data yang sudah diinputkan
        System.out.println("\nData Pengunjung Hotel:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Nama: " + namaPengunjung[i]);
            System.out.println("Tujuan Menginap: " + tujuanMenginap[i]);
            System.out.println("Asal Pengunjung: " + asalPengunjung[i]);
            System.out.println();
        }

        // Menutup scanner
        scanner.close();
    }
}
