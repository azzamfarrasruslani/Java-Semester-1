package Pertemuan13;

import java.util.Scanner;

// @author Azzam Farras Ruslani
public class Tugas3FIX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jmlMhs = input.nextInt();

        // Use split to separate individual answer keys
        String kunciJwb[] = {"A", "C", "D", "C", "A"};
        String jwb[][] = new String[jmlMhs][5];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Jawaban Mahasiswa ke-" + (i + 1) + " : ");
            for (int j = 0; j < 5; j++) {
                jwb[i][j] = input.next();
            }
        }
        for (int i = 0; i < jmlMhs; i++) {
            int tampungBenar = 0;
            for (int j = 0; j < kunciJwb.length; j++) {
                if (kunciJwb[j].equals(jwb[i][j])) {
                    tampungBenar++;
                }
            }
            int skor = tampungBenar * 20;
            System.out.println("Mhs " + (i + 1) + " : "
                    + tampungBenar + " Jawaban Benar, skor " + skor);
        }
    }
}
