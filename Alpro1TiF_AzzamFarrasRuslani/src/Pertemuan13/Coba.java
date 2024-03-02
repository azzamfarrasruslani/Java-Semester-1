package Pertemuan13;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Coba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMhs = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Mahasiswa"));

        char kunciJwb[] = {'A', 'C', 'D', 'C', 'A'};
        char jwb[][] = new char[jmlMhs][kunciJwb.length];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukan jawaban Mahasiswa ke- " + (i + 1));
            for (int j = 0; j < kunciJwb.length; j++) {
                jwb[i][j] = input.next().charAt(0);
            }
        }

        for (int i = 0; i < jmlMhs; i++) {
            int tampungBenar = 0;

            // Membandingkan jawaban mahasiswa dengan kunci jawaban
            for (int j = 0; j < kunciJwb.length; j++) {
                if (kunciJwb[j] == jwb[i][j]) {
                    tampungBenar++;
                }
                
            }

            int skor = tampungBenar * 20;
            System.out.println("Mhs " + (i + 1) + ": " + tampungBenar + " Jawaban Benar, skor " + skor);
        }
    }
}

