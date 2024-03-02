package Pertemuan10;
import java.util.Scanner;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas3FIX {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // Membersihkan newline buffer

        String[][] dataMahasiswa = new String[jumlahMahasiswa][3]; // Array untuk menyimpan data mahasiswa (Nama, NIM, Jurusan)

        // Mengisi data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data untuk mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            dataMahasiswa[i][0] = input.nextLine();
            System.out.print("NIM: ");
            dataMahasiswa[i][1] = input.nextLine();
            System.out.print("Jurusan: ");
            dataMahasiswa[i][2] = input.nextLine();
        }

        // Menampilkan daftar mahasiswa
        System.out.println("\nDaftar Mahasiswa:");
        System.out.println("--------------------------------------------------");
        System.out.printf("| %-3s | %-15s | %-15s | %-20s |\n", "No", "Nama", "NIM", "Jurusan");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("| %-15s | %-15s | %-20s |\n",dataMahasiswa[i][0], dataMahasiswa[i][1], dataMahasiswa[i][2]);
        }

        System.out.println("--------------------------------------------------");

        input.close();
    }
}
