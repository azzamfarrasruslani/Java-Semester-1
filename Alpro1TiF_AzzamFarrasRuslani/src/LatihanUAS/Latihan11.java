
package LatihanUAS;
import java.util.Scanner;
public class Latihan11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int totalNilai = 0;
        int jumlahNilai = 0;
        int maksimalNilai = Integer.MIN_VALUE;
        int nilai;

        System.out.println("Masukkan nilai-nilai ujian (akhiri dengan 1000):");

        do {
            System.out.print("Masukkan nilai: ");
            nilai = scanner.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Inputan data salah. Nilai harus antara 0 dan 100.");
            } else {
                if (nilai != 1000) {
                    totalNilai += nilai;
                    jumlahNilai++;

                    if (nilai > maksimalNilai) {
                        maksimalNilai = nilai;
                    }
                }
            }

        } while (nilai != 1000);

        if (jumlahNilai > 0) {
            double rataRata = (double) totalNilai / jumlahNilai;
            System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
            System.out.println("Nilai maksimal: " + maksimalNilai);
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }
    }
}
