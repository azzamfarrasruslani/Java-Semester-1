package praktikum8;
import java.util.Scanner;



/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Perulangan untuk memungkinkan pengguna mengulang program
        while (true) {
            // Meminta input jumlah anak-anak dan dewasa
            System.out.print("Masukkan jumlah anak-anak: ");
            int jumlahAnak = input.nextInt();

            System.out.print("Masukkan jumlah dewasa: ");
            int jumlahDewasa = input.nextInt();

            // Menghitung total harga tiket untuk anak-anak
            int totalHargaAnak = 0;
            for (int i = 0; i < jumlahAnak; i++) {
                System.out.print("Masukkan usia anak " + (i + 1) + ": ");
                int usiaAnak = input.nextInt();

                if (usiaAnak <= 3) {
                    totalHargaAnak += 100000;
                } else if (usiaAnak <= 8) {
                    totalHargaAnak += 110000;
                } else {
                    totalHargaAnak += 150000;
                }
            }

            // Menghitung total harga tiket untuk dewasa
            int totalHargaDewasa = jumlahDewasa * 250000;

            // Menghitung total harga tiket keseluruhan
            int totalHarga = totalHargaAnak + totalHargaDewasa;

            // Menentukan diskon jika jumlah orang lebih dari 5
            if ((jumlahAnak + jumlahDewasa) > 5) {
                double diskon = 0.25 * totalHarga;
                totalHarga -= diskon;
            }

            // Menampilkan total harga tiket setelah diskon
            System.out.println("Total harga tiket setelah diskon: Rp. " + totalHarga);

            // Meminta input apakah pengguna ingin mengulang program
            System.out.print("Apakah Anda ingin memesan tiket lagi? (ya/tidak): ");
            String jawaban = input.next();

            // Keluar dari perulangan jika jawaban tidak sama dengan "ya"
            if (!jawaban.equalsIgnoreCase("ya")) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }
        }

        // Menutup scanner setelah selesai digunakan
//        input.close();

    }
}
        
