package alpro1tif_azzamfarrasruslani;

import java.util.Scanner;

/**
 *
 * @author Kelompok 6
 */
public class soal1 {

    public static void main(String[] args) {

        int inputAngka, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyak Data : ");
        inputAngka = input.nextInt();
        int hasil = 1;
        for (i = inputAngka; i >= 1; i--) {
            hasil = hasil * i;
            if (i == 1) {
                System.out.print(i + "=" + hasil);
            } else {
                System.out.print(i + "*");
            }
        }

    }
}
