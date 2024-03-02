package Pertemuan13;

import java.util.Scanner;
import java.util.Arrays;

// @author Azzam Farras Ruslani
public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jmlMhs = input.nextInt();
        char kunciJwb[] = {'A', 'C', 'D', 'C', 'A'};
        char jwb[][] = new char[jmlMhs][kunciJwb.length];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukan jawaban Mahasiswa ke- " + (i + 1) + ": ");
            for (int j = 0; j < kunciJwb.length; j++) {
                System.out.println("Soal ke- " + (j + 1));
                jwb[i][j] = input.next().charAt(0);
            }
        }
        System.out.println(Arrays.deepToString(jwb));
        for (int i = 0; i < jmlMhs; i++) {
            int tampungBenar = 0;
            for (int j = 0; j < kunciJwb.length; j++) {
                if (kunciJwb[j] == jwb[i][j]) {
                    tampungBenar++;
                }
            }
            int skor = tampungBenar * 20;
            System.out.println("Mhs " + (i + 1) + " : "
                    + tampungBenar + " Jawaban Benar, skor " + skor);
        }
    }
}
